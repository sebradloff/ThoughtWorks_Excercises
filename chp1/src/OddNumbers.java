/**
 * Created by sebass on 2/5/15.
 */
public class OddNumbers {

    public static void main(String []args){
        int num = 100;
        int sum = 0;

        while (num > 0) {
            if (num % 2 == 1){
                sum += num;
            }
            num--;
        }
        System.out.println("The sum of all odd numbers between 1 and 100 is " + sum);
    }
}
