/**
 * Created by sebass on 2/5/15.
 */
public class Counter {
    int count = 0;

    void increment(){
        count++;
    }

    void total() {
        System.out.println("You called the increment method " + count + " times.");
    }

    public static void main(String []args){
        Counter c1 = new Counter();
        int num = 0;

        while (num < 5){
            c1.increment();
            num++;
        }

        c1.total();
    }

}
