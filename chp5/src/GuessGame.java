/**
 * Created by sebass on 2/7/15.
 */
public class GuessGame {
    private int winningNum;

    public GuessGame(){
        winningNum = (int) (Math.random() * 100) + 1;
    }

    public static void main(String []args){
        GuessGame game1 = new GuessGame();

    }
}
