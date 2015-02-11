import java.util.ArrayList;

/**
 * Created by sebass on 2/11/15.
 */
public class GuessGame {
    private int winningNum;
    private boolean gameOver;
    private ArrayList<Integer> guessList;

    public GuessGame(){
        winningNum = (int) (Math.random() * 100) + 1;
        gameOver = false;
    }

    public void rateGuess(String guess){
        int guessNum = Integer.parseInt(guess);
        guessList.add(guessNum);
        if (guessNum > winningNum){
            System.out.println("Your guess was too high!");
        } else if (guessNum < winningNum){
            System.out.println("Your guess was too low!");
        } else {
            System.out.println("You guessed correctly!");
            gameOver = true;
        }
    }

    public boolean isGameOver(){
        return gameOver;
    }

    public static void main(String []args) {
        GuessGame game1 = new GuessGame();
        GuessGameHelper gameHelper = new GuessGameHelper();

        while (game1.isGameOver() == false) {
            String prompt = "Please enter a number between 1 and 100: ";
            String guess = gameHelper.getUserInput(prompt);
            game1.rateGuess(guess);
        }
        
    }
}
