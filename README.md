# Flappy Bird Restored

A recreation of the original Android **Flappy Bird v1.3** (`com.dotgears.flappybird`, 2014) by **Dong Nguyen (.GEARS Studios)**, updated for modern Android versions (targetSdk 35, 64-bit devices, high-refresh-rate displays).

> [!NOTE]
> **AI Restoration Notice**: This project was implemented using AI/LLMs (Antigravity), reconstructing the game from decompiled Java and Smali bytecode from the original APK.

---

## Acknowledgments

Thanks to **Dong Nguyen (.GEARS Studios)** for creating the original Flappy Bird. This repository is an independent, non-commercial project for technical study, preservation, and compatibility on modern Android hardware.

---

## Background & Motivation

The original 2014 APK relied on 32-bit native libraries (`libandengine.so`), deprecated SDKs, and fixed timing assumptions, preventing it from running properly on modern 64-bit-only devices or high-refresh-rate screens. 

This repository reconstructs the game in standard Java using Android's GLES 2.0 API, preserving the original physics, timing, and assets while running natively on modern Android.

---

## Technical Details & Original Optimizations

Decompilation of the original release highlights several design decisions and optimizations used to maintain a stable 60 FPS on early Android devices:

### 1. Zero-Allocation Game Loop
On early Android versions running the Dalvik VM, garbage collection pauses could introduce noticeable frame drops. The original game avoided runtime heap allocations:
* **No dynamic allocations during gameplay**: Objects are not instantiated in the main loop.
* **Pre-allocated object pools**: Spawning entities, pipes, and score particles cycle through pre-allocated fixed-size arrays (`EntityPool`).
* **Primitive arrays**: Coordinates and states are tracked in flat `int[]` and `float[]` arrays.

### 2. Precomputed Integer Math & Easing Tables
To reduce overhead on early ARM hardware without fast floating-point units:
* **Sine/Cosine Lookup Tables**: `GameMath` uses static precomputed integer tables for angles `0..359` instead of standard `Math.sin()` / `Math.cos()`.
* **Precomputed Easing Curves**: 10 easing tables (values 0..100) are stored in static arrays. The game over banner and scoreboard drop animations use Curve 11.
* **Bit shifts for alignment**: Centering offsets use bitwise shifts (e.g., `(288 - w) >> 1`) instead of division.

### 3. Discrete Movement Over Physics Engines
Rather than using a generic physics engine (like Box2D) with continuous forces, mass, and drag, the game uses simple per-tick calculations that give it its distinct feel:
* **Instant Flap Response**: Tapping immediately resets vertical speed to a fixed upward velocity, completely canceling any accumulated downward momentum, while pitching the nose up.
* **Capped Fall Speed**: Gravity adds downward speed each tick, but is capped at a maximum terminal fall speed so falling never becomes uncontrollable.
* **Accelerating Pitch-Down**: After flapping, the bird briefly holds its upward tilt before gravity forces the nose downward, accelerating into a locked 90° vertical dive until tapped again.
* **Pre-Game Hover**: On the tutorial screen, the bird smoothly bobs up and down along a 4-pixel sine curve before the player's first tap.

### 4. Hitbox Offsets
Collision bounding boxes in `Actor` are slightly smaller than the visual sprite boundaries, allowing close passes near pipe edges without triggering a collision.

### 5. Batched Quad Rendering
All 71 visual assets are packed into a single texture atlas (`atlas.png`). Up to 50 active sprite quads are drawn in a single batched draw call per frame without texture re-binding.

---

## Modern Adaptations

The original game logic and constants remain intact, with the platform layer updated for modern Android:

| Feature | Original 2014 APK | This Restoration |
| :--- | :--- | :--- |
| **Android Target** | Android 4.4 (API 19) | Android 15 (targetSdk 35, minSdk 21) |
| **Architecture** | 32-bit only (`armeabi-v7a`, `x86`) | 64-bit Java / GLES 2.0 (arm64-v8a, x86_64) |
| **Native Dependencies** | `libandengine.so` | None (pure Java + standard GLES 2.0) |
| **Display Scaling** | Fixed aspect ratio | Pillarboxed / letterboxed viewport for modern aspect ratios |
| **High Refresh Rates** | Tied to display refresh (sped up on >60Hz) | Rate-aware `CadenceScheduler` (60/90/120/144/240Hz) |
| **Package ID** | `com.dotgears.flappybird` | `com.dotgears.flappybird.restored` (allows side-by-side install) |
| **Tests** | None | 143 unit tests covering math, physics, and cadence |

### High Refresh Rate Handling
On displays running at 90Hz, 120Hz, or 144Hz, fixed frame callbacks either speed up the simulation or cause uneven frame pacing. 

`CadenceScheduler` uses a Bresenham accumulator to step the 60 Hz simulation evenly across display refresh rates (60, 90, 120, 144, 240 Hz) while monitoring hardware VSync cadence via Choreographer.

---

## Building & Installing

### Prerequisites
* JDK 17 or JDK 21
* Android SDK (API 35, Build Tools 35.0.0)
* Gradle 8.14+ (or Android Studio)

### Build Debug APK
```bash
# Run unit tests
gradle test

# Assemble debug APK
gradle assembleDebug
```
The compiled APK will be located at:
`app/build/outputs/apk/debug/app-debug.apk`

### Install to Device
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

---

## Project Structure

```
flappybird/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── assets/              # Original atlas.png, atlas.txt, and sound effects
│   │   │   ├── java/com/dotgears/
│   │   │   │   ├── GameActivity.java        # Immersive Activity & Choreographer tracking
│   │   │   │   ├── GLRenderer.java          # GLES 2.0 quad batch renderer
│   │   │   │   ├── CadenceScheduler.java    # Bresenham cadence scheduler
│   │   │   │   ├── AudioManager.java        # SoundPool audio dispatcher
│   │   │   │   ├── GameEngine.java          # Core .GEARS entity engine
│   │   │   │   ├── GameMath.java            # Trig and easing tables
│   │   │   │   └── flappy/
│   │   │   │       ├── FlappyGame.java      # Game state, pipes & collision logic
│   │   │   │       └── Bird.java            # Bird physics & hover motion
│   │   │   └── res/                         # Launcher icons and app metadata
│   │   └── test/java/com/dotgears/          # Unit tests
│   └── build.gradle.kts
├── apktool_source/                  # Forensic reference (Smali bytecode)
├── jadx_source/                     # Forensic reference (decompiled Java)
└── MIGRATION_PROGRESS.md            # Class-by-class migration status
```

---

## Legal & Disclaimer

* **Flappy Bird** and all original artwork, audio, and game designs are the property of **Dong Nguyen** and **.GEARS Studios**.
* This project is an independent, non-commercial educational archive and platform compatibility restoration.
