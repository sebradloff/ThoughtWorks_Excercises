/**
 * Created by sebass on 2/17/15.
 */
public class Orc implements Monster {
    private String name;
    private int hitpoints;

    public Orc(){
            name = "Orc";
            hitpoints = 20;
    }


    public void takeDamage(int amount){
        if ((hitpoints - amount) < 0){
            hitpoints = 0;
        } else{
            hitpoints -= amount;
        }
    };

    public String name(){
        return name;
    };

    public int currentHitpoints(){
        return hitpoints;
    };
};
