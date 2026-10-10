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
- [x] `Actor.java` (`com.dotgears.C0220q`) - Sprite entity with bounds, collision offsets, frame arrays (Verified with origin offset & render tests)
- [x] `SpriteAnimation.java` (`com.dotgears.C0201d`) - Frame sequence player (Verified with 15ms accumulator & looping tests)
- [x] `Tween.java` (`com.dotgears.C0221r`) - Value interpolator using `GameMath` curves (Verified with 60 Hz linear & easing progression tests)
- [x] `EntityPool.java` (`com.dotgears.C0217n`) - Pre-allocated fixed-size array object pool (Verified with round-robin cycling & reset tests)

### 3. UI & Secondary Entities
- [x] `Button.java` (`com.dotgears.C0203f`) - Touch UI button (bounds check, click handling, 2px pressed offset) (Verified with bounding box & click lifecycle test suite)
- [x] `Sparkle.java` (`com.dotgears.C0202e`) - Medal glint / sparkle animation (Verified with 5-frame sequence, auto-deactivation & offset render test suite)
- [x] `Medal.java` (`com.dotgears.C0214k`) - Award medal renderer with sparkle timers (Verified with 4-tier render, 30-tick countdown & surface sparkle test suite)
- [x] `ScoreParticle.java` (`com.dotgears.C0218o`) - Floating score indicator (Verified with 4-subtick gravity, lifespan, kerning & sign rendering test suite)
- [x] `ScoreBoard.java` (`com.dotgears.C0219p`) - End-game results board and score counter (Verified with slide-in tween, rolling score, NEW badge & medal tiers test suite)
- [x] `GameOverBanner.java` (`com.dotgears.flappy.C0208e`) - Drop animation for "GAME OVER" (Verified with curve 11 tween, bounce physics settling & ScoreBoard handoff test suite)
- [x] `Tutorial.java` (`com.dotgears.flappy.C0209f`) - "Get Ready" and tap finger tutorial (Verified with linear fade-in, tap dismiss & fade-out lifecycle test suite)

### 4. Primary Game Entities & Mechanics
- [x] `Bird.java` (`com.dotgears.flappy.C0204a`) - Bird physics, flap impulse, gravity, angle clamping (Verified with immutable physics, hover wave, ground clamping & 3-color render test suite)

### 5. Engine, World & Game Loop
- [x] `GameEngine.java` (`com.dotgears.C0210g`) - Base DotGears game engine, atlas parser, render queue (Verified with event queue, tweens, screen shake, screen fade/flash, input coordinates & quad routing test suite)
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
