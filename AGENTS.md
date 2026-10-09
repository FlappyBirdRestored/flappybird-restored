# Flappy Bird Recreation Project - Workspace Rules & Guidelines

## 1. Project Goal & Fidelity Mandate
* **Primary Objective**: 1:1 recreation of the original Android Flappy Bird v1.3 (`com.dotgears.flappybird`) source code and UX.
* **Strict UX/Visual Parity**: The game's mechanics, physics feel, pixel-art scaling, animation frame delays, sound timing, and UI flows must be identical to the original 2014 release.
* **Modern Target**: The restored app must run smoothly on modern Android versions (Android 14+, targetSdk 34/35, 64-bit ARM/x86_64, edge-to-edge displays).
* **Reference Baselines are Read-Only**: Never modify or overwrite files in `apktool_source/` or `jadx_source/`. These are the ground-truth forensic references.

---

## 2. Immutable Physics & Game Constants
Do NOT refactor, approximate, or replace the game physics with third-party physics engines (e.g., Box2D, Unity, or standard Android Animators). The following constants and formulas from `com.dotgears.flappy.C0204a` must be preserved verbatim:

* **Canvas / Viewport**: Fixed virtual resolution of **288 x 512** pixels (portrait).
* **Game Tick Rate**: Fixed **60 Hz** time-step (`dt = 1/60s` / ~16.66ms per tick), decoupled from high refresh rate displays (90Hz/120Hz).
* **Bird Initial Position**: `(x: 80, y: 246)`.
* **Flap Impulse**: Initial velocity `t = -5.0f`, jump tilt impulse `r = -10.0f`.
* **Gravity Acceleration**: `u = 0.3f` added to velocity `t` per tick.
* **Terminal Velocity**: Clamped at maximum fall speed `t <= 8.0f`.
* **Rotation Dynamics**: Angular acceleration `s = 0.4f` added to angular velocity `r` per tick; bird angle `q` clamped strictly between `-20.0f` (facing up) and `90.0f` (nosediving).
* **Ground Collision Level**: `y = 400 - colliderHeight`.
* **Idle Hover Wave**: Pre-game hover sine motion: `angleIndex = (angleIndex + 8) % 360`, `offsetY = sin(angleIndex) * 4.0f`.
* **RNG / Day-Night Selection**: Background selection uses `rng % 10 > 3 ? bg_day : bg_night`. Bird color selection uses `rng % 3` (0: yellow, 1: blue, 2: red).

---

## 3. Symbol & De-obfuscation Dictionary
When restoring decompiled classes, follow this mapping to maintain consistent naming across the codebase:

| Decompiled Class | Restored Class Name | Purpose |
| :--- | :--- | :--- |
| `com.dotgears.C0216m` | `GameObject` | Base entity (`update(dt)`, `render(engine)`, active/visible flags) |
| `com.dotgears.C0220q` | `Actor` / `SpriteEntity` | Entity with bounds, collider offsets, animation state, frames |
| `com.dotgears.C0201d` | `SpriteAnimation` | Frame animation player (delay, frame array, loop flag) |
| `com.dotgears.C0212i` | `AtlasItem` | Sub-texture definition parsed from `atlas.txt` (UV coordinates) |
| `com.dotgears.C0213j` | `GameMath` | Lookup tables (360° sin/cos, easing curves 0..100, PRNG) |
| `com.dotgears.C0221r` | `Tween` | Value interpolator using `GameMath` easing curves |
| `com.dotgears.C0217n` | `EntityPool` | Fixed-size array object pool for game objects |
| `com.dotgears.C0203f` | `Button` | Interactive UI button (press/release/touch bounds) |
| `com.dotgears.C0215l` | `NumberRenderer` | Digits renderer for score/high-score using atlas sprites |
| `com.dotgears.C0211h` | `BitmapFont` | ASCII digit font renderer (`font_048`..`font_057`) |
| `com.dotgears.C0202e` | `Sparkle` | Medal sparkle / blink effect (`blink_00`..`02`) |
| `com.dotgears.C0214k` | `Medal` | Awarded medal renderer with sparkle timers |
| `com.dotgears.C0218o` | `ScoreParticle` | Floating score points indicator |
| `com.dotgears.C0219p` | `ScoreBoard` | Results dialog, score rolling counter, high score, medals |
| `com.dotgears.C0204a` | `Bird` | Bird physics, state, collisions, animations |
| `com.dotgears.C0208e` | `GameOverBanner` | "GAME OVER" banner drop animation and triggers |
| `com.dotgears.C0209f` | `Tutorial` | "Get Ready" and tap finger tutorial overlay |
| `com.dotgears.C0210g` | `GameEngine` | Base engine: atlas loading, input handling, sprite render queue |
| `com.dotgears.C0206c` | `FlappyGame` | Main game controller: pipe spawning, scrolling, game state |
| `com.dotgears.C0200c` | `FlappyScene` | Rendering bridge mapping 50 sprite quads to the OpenGL renderer |
| `com.dotgears.GameActivity` | `GameActivity` | Main Android Activity |
| `com.dotgears.flappy.SplashScreen` | `SplashScreen` | 2-second splash screen Activity |

---

## 4. Architecture & Technical Constraints
1. **Target Directory Anchor**: All restored production code MUST be written under `app/src/main/java/` (and resources under `app/src/main/res/` and `app/src/main/assets/`). NEVER write implementation code in the workspace root or inside `jadx_source/`.
2. **Zero 32-bit Native Code**: Do NOT depend on legacy `libandengine.so`. Implement rendering via a modern, lightweight standard Android `GLSurfaceView.Renderer` (GLES20) that draws 50 quads from `atlas.png`.
3. **Zero-Allocation / Zero-GC in Game Loop**: Preserve Dong Nguyen's design pattern of pre-allocated static arrays (e.g. `int[]` pools) and object pools (`EntityPool`). Do NOT "modernize" them into `ArrayList`, lambdas, or dynamic heap allocations inside `update()` or `render()`, as this introduces garbage collection stutters.
4. **Audio Backend**: Use modern Android `SoundPool` for immediate low-latency playback of the 5 sound effects (`sfx_wing.ogg`, `sfx_hit.ogg`, `sfx_die.ogg`, `sfx_point.ogg`, `sfx_swooshing.ogg`).
5. **Display Scaling**: Modern screens are 19.5:9 or 20:9. The 288x512 virtual canvas must be pillarboxed/letterboxed with clean aspect-ratio preservation; never stretch or blur the pixel art.
6. **Third-Party SDKs**: Decouple and stub obsolete 2012 Google AdMob (`com.google.ads`) and Play Games Services (`basegameutils`). The core game must run standalone and offline.

---

## 5. Agent Workflow Rules & Restoration Protocol
* **Progress Tracking**: Always consult [MIGRATION_PROGRESS.md](MIGRATION_PROGRESS.md) before starting any task. When a class is implemented and verified, update its checkbox in `MIGRATION_PROGRESS.md`.
* **Granular Iteration**: Reconstruct and verify **one class or module at a time**. Never attempt multi-class rewrites without confirming mathematical and logical equivalence.
* **Class Restoration Protocol (Step-by-Step)**:
  1. **Forensic Analysis**: Read decompiled class in `jadx_source/sources/` AND cross-check raw instructions in `apktool_source/smali/`.
  2. **Symbol Mapping**: Map obfuscated variables and methods to the Symbol Dictionary in Section 3.
  3. **Arithmetical Parity**: Preserve exact arithmetic (integer divisions, bit shifts like `(288 - w) >> 1`, easing curves).
  4. **Target Implementation**: Write clean Java code into `app/src/main/java/...`.
  5. **Verification**: Verify that all callers and references compile and adhere to the original contracts.
  6. **Checklist Update**: Mark the item complete in `MIGRATION_PROGRESS.md`.
* **Smali Verification**: If Jadx decompilation contains missing instructions, unrolled loops, or ambiguous ternary logic, verify against the raw Smali code in `apktool_source/smali/` before writing code.
* **Code Style**: Keep the code clean, well-commented, and true to the original procedural Java architecture. Avoid unnecessary boilerplate frameworks or premature abstractions.

