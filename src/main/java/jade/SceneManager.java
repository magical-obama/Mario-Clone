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
     * Change the Scene
     * @param newScene The scene to switch to
     */
    public void changeScene(Scene newScene) {

        activeScene = newScene;
        // TODO: Play In Animation
    }
}
