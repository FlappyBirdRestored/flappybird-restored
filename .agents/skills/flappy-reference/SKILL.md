---
name: flappy-reference
description: >-
  Provides the reverse-engineered symbol dictionary, exact physics constants, sprite atlas structure, and architecture specifications for the Flappy Bird 1:1 recreation project.
---

# Flappy Bird Reference Cheatsheet

Use this reference when implementing, de-obfuscating, or debugging any part of the Flappy Bird source code recreation.

## 1. Class Mapping Table

| Decompiled File | Reconstructed Class | Original Package | Description |
| :--- | :--- | :--- | :--- |
| `GameActivity.java` | `GameActivity` | `com.dotgears` | Main Android Activity (viewport, sounds, layout) |
| `SplashScreen.java` | `SplashScreen` | `com.dotgears.flappy` | 2-second splash screen Activity |
| `C0200c.java` | `FlappyScene` | `com.dotgears` | Scene adapter wiring DotGears engine to 50 OpenGL sprites |
| `C0201d.java` | `SpriteAnimation` | `com.dotgears` | Frame-by-frame animation sequencer |
| `C0202e.java` | `Sparkle` | `com.dotgears` | Medal sparkle particle animation (`blink_00`..`02`) |
| `C0203f.java` | `Button` | `com.dotgears` | Touch UI button (bounds check, click event) |
| `C0204a.java` | `Bird` | `com.dotgears.flappy` | Bird physics, jump, rotation, hover sine wave |
| `C0205b.java` | `FlappyFont` | `com.dotgears.flappy` | Customized font subclass of `BitmapFont` |
| `C0206c.java` | `FlappyGame` | `com.dotgears.flappy` | Main game controller (pipes, collision, score, states) |
| `C0208e.java` | `GameOverBanner` | `com.dotgears.flappy` | "GAME OVER" banner drop animation and triggers |
| `C0209f.java` | `Tutorial` | `com.dotgears.flappy` | "Get Ready" and tap finger tutorial overlay |
| `C0210g.java` | `GameEngine` | `com.dotgears` | Core engine: atlas loader, touch dispatch, sprite queue |
| `C0211h.java` | `BitmapFont` | `com.dotgears` | ASCII digit font renderer (`font_048`..`font_057`) |
| `C0212i.java` | `AtlasItem` | `com.dotgears` | Sprite atlas region parsed from `atlas.txt` |
| `C0213j.java` | `GameMath` | `com.dotgears` | Trig lookup tables (360°), easing tables (0..100), PRNG |
| `C0214k.java` | `Medal` | `com.dotgears` | Medal renderer and sparkle trigger |
| `C0215l.java` | `NumberRenderer` | `com.dotgears` | Number drawer using sprite atlas glyphs |
| `C0216m.java` | `GameObject` | `com.dotgears` | Base entity (`update(dt)`, `render(engine)`) |
| `C0217n.java` | `EntityPool` | `com.dotgears` | Fixed-size array object pool |
| `C0218o.java` | `ScoreParticle` | `com.dotgears` | Floating score points effect |
| `C0219p.java` | `ScoreBoard` | `com.dotgears` | End-game score board, counter animation, high score |
| `C0220q.java` | `Actor` | `com.dotgears` | Sprite entity with animations and collision bounds |
| `C0221r.java` | `Tween` | `com.dotgears` | Value interpolator using `GameMath` easing curves |

---

## 2. Exact Physics & Mechanics Specification

### Bird Physics (`Bird.java` / `C0204a`)
* **Initial Spawn**: `(x = 80, y = 246)`
* **Flap Input**:
  * Vertical velocity: `velocity = -5.0f`
  * Angular velocity: `rotVel = -10.0f`
  * Gravity step: `gravity = 0.3f`
  * Angular step: `rotAcc = 0.4f`
  * SFX triggered: Sound index 4 (`sfx_wing.ogg`)
* **Per-Tick Update (60 Hz)**:
  * In play:
    * `velocity += gravity` (clamped to max `8.0f`)
    * `y += velocity`
    * Ground clamp: `if (y > 400 - colliderHeight) y = 400 - colliderHeight`
    * `angle += rotVel`
    * `rotVel += rotAcc`
    * Angle clamp: `angle` clamped between `-20.0f` and `90.0f`
  * In idle/pre-game hover:
    * `hoverAngle = (hoverAngle + 8) % 360`
    * `hoverOffsetY = GameMath.sin(hoverAngle) * 4.0f`
* **Color / Type Selection**:
  * `birdType = GameMath.random() % 3` (0: Yellow, 1: Blue, 2: Red)

### World & Pipes (`FlappyGame.java` / `C0206c`)
* **Canvas Size**: 288 x 512
* **Ground Height**: Y = 400 (Land height is 112, canvas height is 512)
* **Pipe Spacing / Gap**:
  * 3 pipe pairs cycled across the screen.
  * Vertical pipe gap between top and bottom pipe: fixed distance.
* **Medal Thresholds**:
  * Bronze: 10
  * Silver: 20
  * Gold: 30
  * Platinum: 40
* **Day / Night Selection**:
  * `GameMath.random() % 10 > 3 ? bg_day : bg_night` (70% day, 30% night)

---

## 3. Assets & Atlas Format
* File: `res/raw/atlas.txt` (or `assets/atlas.txt`)
* Format per line: `<name> <width> <height> <u1> <v1> <u2> <v2>`
* Coordinates: UV normalized on 1024 x 1024 texture ([atlas.png](apktool_source/assets/gfx/atlas.png)).
