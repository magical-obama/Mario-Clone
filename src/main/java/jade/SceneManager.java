package jade;

public class SceneManager {
    private static SceneManager instance;
    /**
     * The current scene
     */
    public Scene activeScene;

    private SceneManager() {
        activeScene = null;
    }

    public static SceneManager get() {
        if (instance == null) {
            instance = new SceneManager();
        }

        return instance;
    }

    /**
     * Change the Scene, without animation/transition
     * @param newScene The scene to switch to
     */
    public void changeScene(Scene newScene) {
        activeScene = newScene;
    }

    /**
     * Change the scene, with animation/transition
     * @param newScene The scene to switch to
     * @param dt Delta time
     */
    public void changeScene(Scene newScene, float dt) {
        boolean outEnded = activeScene.out(dt);
        if (outEnded) {
            activeScene = newScene;
        }
    }

}
