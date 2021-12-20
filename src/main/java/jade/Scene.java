package jade;

public abstract class Scene {

    public Scene() {}

    public abstract void update(float dt);

    /**
     * Scene In Animation
     * @param dt Delta Time
     * @return true if finished
     */
    public abstract boolean in(float dt);

    /**
     * Scene Out Animation
     * @param dt Delta Time
     * @return true if finished
     */
    public abstract boolean out(float dt);
    public abstract void init();
}
