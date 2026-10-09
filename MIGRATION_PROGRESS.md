# Flappy Bird 1:1 Reconstruction - Migration Progress

This file is the **Living Source of Truth** for the reconstruction progress.
Any agent beginning a task **MUST** read this file to determine the current state.
Any agent completing a class **MUST** update this file.

---

## Overall Status
* **Current Phase**: Phase 2 (Data, Math & Utilities)
* **Completed Phases**:
  * [x] **Phase 1: Project Scaffolding & Setup** (Modern Gradle 8.7, targetSdk 35, AndroidManifest, asset/sound migration verified with SHA256 parity)
* **Target Package**: `com.dotgears` / `com.dotgears.flappy`
* **Target Location**: `app/src/main/java/`


---

## Class Migration Checklist

### 1. Data, Math & Utilities
- [x] `GameMath.java` (`com.dotgears.C0213j`) - Trig lookup tables (360°), easing tables (0..100), PRNG (Verified with JUnit test suite)
- [x] `AtlasItem.java` (`com.dotgears.C0212i`) - Atlas coordinate entry data model (Verified with 71-sprite atlas test suite)
- [x] `NumberRenderer.java` (`com.dotgears.C0215l`) - Digit renderer for HUD and scores (Verified with right-alignment & leading zeros test suite)
- [x] `BitmapFont.java` (`com.dotgears.C0211h`) - ASCII digit font renderer (Verified with kerning & alignment test suite)
- [x] `FlappyFont.java` (`com.dotgears.flappy.C0205b`) - Font variant for Flappy Bird (Verified with kerning 4 & "font" prefix)

### 2. Core Entity & Animation System
- [x] `GameObject.java` (`com.dotgears.C0216m`) - Base entity class (`update`, `render`, active/visible)
- [ ] `Actor.java` (`com.dotgears.C0220q`) - Sprite entity with bounds, collision offsets, frame arrays
- [ ] `SpriteAnimation.java` (`com.dotgears.C0201d`) - Frame sequence player
- [ ] `Tween.java` (`com.dotgears.C0221r`) - Value interpolator using `GameMath` curves
- [ ] `EntityPool.java` (`com.dotgears.C0217n`) - Pre-allocated fixed-size array object pool

### 3. UI & Secondary Entities
- [ ] `Button.java` (`com.dotgears.C0203f`) - Touch UI button (bounds check, click handling)
- [ ] `Sparkle.java` (`com.dotgears.C0202e`) - Medal glint / sparkle animation
- [ ] `Medal.java` (`com.dotgears.C0214k`) - Award medal renderer with sparkle timers
- [ ] `ScoreParticle.java` (`com.dotgears.C0218o`) - Floating score indicator
- [ ] `ScoreBoard.java` (`com.dotgears.C0219p`) - End-game results board and score counter
- [ ] `GameOverBanner.java` (`com.dotgears.flappy.C0208e`) - Drop animation for "GAME OVER"
- [ ] `Tutorial.java` (`com.dotgears.flappy.C0209f`) - "Get Ready" and tap finger tutorial

### 4. Primary Game Entities & Mechanics
- [ ] `Bird.java` (`com.dotgears.flappy.C0204a`) - Bird physics, flap impulse, gravity, angle clamping

### 5. Engine, World & Game Loop
- [ ] `GameEngine.java` (`com.dotgears.C0210g`) - Base DotGears game engine, atlas parser, render queue
- [ ] `FlappyGame.java` (`com.dotgears.flappy.C0206c`) - Main world controller, pipe generation, collisions

### 6. Platform, Rendering & Audio
- [ ] `GLRenderer.java` - Clean GLES20 quad renderer (replaces legacy `C0200c` / AndEngine)
- [ ] `AudioManager.java` - Low-latency `SoundPool` audio manager
- [ ] `GameActivity.java` (`com.dotgears.GameActivity`) - Main Android Activity
- [ ] `SplashScreen.java` (`com.dotgears.flappy.SplashScreen`) - 2-second splash screen

---

## Technical Decisions Log
* **Rendering Strategy**: Clean-room GLES20 quad renderer mapped to virtual 288x512 resolution (zero 32-bit `libandengine.so`).
* **Memory Model**: Retain original zero-allocation static arrays and object pools to guarantee smooth 60 FPS performance without GC pauses.
* **Third-Party Services**: Decoupled legacy AdMob and Play Games Services; stubbed with offline fallbacks.
