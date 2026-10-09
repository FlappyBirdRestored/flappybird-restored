# Flappy Bird Recreation - Coding and Architecture Rules

## Critical Guidelines for Agents

### 1. Forensic Fidelity
- **Do not guess or invent mechanics**: Everything from pipe spacing to collision boxes, sparkle frequencies, medal thresholds (Bronze: 10, Silver: 20, Gold: 30, Platinum: 40), and score increments is explicitly defined in the decompiled files under `jadx_source/sources/com/dotgears`.
- **Read-only references**: Never edit files inside `apktool_source/` or `jadx_source/`. Treat them as source of truth forensics.

### 2. Physics & Determinism
- Physics formulas are exact Euler numerical integrations updated at 60 Hz.
- Preserved constants:
  - Jump impulse: -5.0 px/frame
  - Gravity: +0.3 px/frame²
  - Max fall speed: 8.0 px/frame
  - Rotation: +0.4 deg/frame² downward acceleration, -10.0 deg on flap, clamped between -20.0° and 90.0°
- Do NOT convert integer coordinate math to arbitrary float physics unless matching the original code.

### 3. Engine & Rendering
- Do NOT attempt to build or link `libandengine.so`. It is 32-bit only and incompatible with modern 64-bit Android.
- The game uses exactly 50 sprites textured from `atlas.png`.
- The display resolution is 288x512. Always maintain aspect ratio (pillarboxing on modern tall phone screens).

### 4. Implementation Steps
- Rebuild modularly in sequence:
  1. Data & Math (`GameMath`, `AtlasItem`, atlas parser)
  2. Entity Base (`GameObject`, `Actor`, `SpriteAnimation`, `Tween`, `EntityPool`)
  3. Game Entities (`Bird`, `Button`, `Medal`, `Sparkle`, `ScoreBoard`, etc.)
  4. World Engine & Game Loop (`GameEngine`, `FlappyGame`)
  5. Rendering & Audio (`GLSurfaceView.Renderer`, `SoundPool`, `GameActivity`)
