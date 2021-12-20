package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private float outTime = 2.0f;
    private boolean isChanging = false;

    public LevelEditorScene() {

    }

    @Override
    public void init() {
        System.out.println("Inside Level editor scene");
    }

    @Override
    public void update(float dt) {
        if (KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            isChanging = true;
        }

        if (isChanging) {
            SceneManager.get().changeScene(new LevelScene());
        }
    }

    @Override
    public boolean in(float dt) {
        return true;
    }

    @Override
    public boolean out(float dt) {
        if (outTime > 0) {
            outTime -= dt;
            Window.get().r -= dt * 5.0f;
            Window.get().g -= dt * 5.0f;
            Window.get().b -= dt * 5.0f;
            return false;
        } else  { return true; }
    }
}
