package jade;

public class SceneManager {
    private static SceneManager instance;
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

    public void changeScene(Scene newScene) {
        activeScene = newScene;
    }
}
