/**
 * Created by sebass on 2/17/15.
 */
public interface Monster {
    public abstract void takeDamage(int amount);

    public abstract String name();

    public abstract int currentHitpoints();

}
