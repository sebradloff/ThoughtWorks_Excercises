/**
 * Created by sebass on 2/17/15.
 */
public class Monster {
    private String name;
    private int hitpoints;

    void takeDamage(int amount){
        if ((hitpoints - amount) < 0){
            hitpoints = 0;
        } else {
            hitpoints -= amount;
        }
    };

    String name(){
        return name;
    };

    int currentHitpoints(){
        return hitpoints;
    };

    public static void main(String []args){
        Orc orc1 = new Orc();
        Troll troll1 = new Troll();
        System.out.print("here");
    }
}
