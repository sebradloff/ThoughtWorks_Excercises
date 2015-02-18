/**
 * Created by sebass on 2/17/15.
 */
import java.util.ArrayList;

public class Runner {
    public static void main(String []args){
        Troll troll1 = new Troll();
        Troll troll2 = new Troll();
        Orc orc1 = new Orc();
        Orc orc2 = new Orc();

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(troll1);
        monsters.add(troll2);
        monsters.add(orc1);
        monsters.add(orc2);

        for (Monster m : monsters){
            m.takeDamage(10);
        }
        for (Monster m : monsters){
            System.out.println(m.name()+ ": " + m.currentHitpoints() + " hitpoints");
        }
    }
}
