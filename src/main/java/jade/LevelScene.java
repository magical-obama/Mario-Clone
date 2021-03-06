package jade;

public class LevelScene extends Scene {
    private float inTime = 2.0f;
    private boolean playIn = true;

    public LevelScene() {
        Window.get().r = 1;
        Window.get().g = 1;
        Window.get().b = 1;
    }

    @Override
    public void init() {
        System.out.println("Inside level scene");
    }

    @Override
    public void update(float dt) {
        if (playIn) {
            playIn = !in(dt);
        }

        System.out.println("" + Math.round(1.0f / dt) + "FPS");

    }

    @Override
    public boolean in(float dt) {
        if (inTime > 0) {
            inTime -= dt;
            Window.get().r += dt * 5.0f;
            Window.get().g += dt * 5.0f;
            Window.get().b += dt * 5.0f;
            return false;
        } else  { return true; }
    }

    @Override
    public boolean out(float dt) {
        return true;
    }
}
