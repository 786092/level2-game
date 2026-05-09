import javax.swing.*;
import java.util.Random;

public class IrfaanNumberGuesser {


    public static void main(String[] args) {
        // 1. Computer picks an integer at random from 1-100.
        Random rand = new Random();
        int number = rand.nextInt(100);
        // 2. User is instructed to guess an integer between 1-100.
        int guesser = getGuess();
        // 3. Computer checks if guess is lower, higher, or exactly equal to random number.
        // 4. If equal, computer informs user that user has won. Go to step 8.
        // 5. If lower, computer informs user that the guess is too low.
        // 6. If higher, computer informs user that the guess is too high.
        if(guesser>number){
            JOptionPane.showMessageDialog(null,"You guessed too high try again.");
        }
        else if(guesser<number){
            JOptionPane.showMessageDialog(null,"You guessed to low try again.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Congratulations, you win!!!");
        }
        // 7. Go back to step 2.
        
        // 8. Inform user that the user has guessed correctly and won. Game ends.
    }

    private static int getGuess() {
        int guesser = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-100"));
        return guesser;
    }

}