/**
 * Created by sebass on 2/17/15.
 */
public class Troll implements Monster {
    private String name;
    private int hitpoints;

    public Troll(){
        name = "Troll";
        hitpoints = 40;
    }


    public void takeDamage(int amount){
        amount = (amount / 2);

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
}
