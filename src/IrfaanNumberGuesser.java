import javax.swing.*;
import java.util.Random;

public class IrfaanNumberGuesser {
    //Computer picks an integer at random from 1-100.
    //User is instructed to guess an integer between 1-100.
    //Computer checks if guess is lower, higher, or exactly equal to random number.
    //If equal, computer informs user that user has won. Go to step 8.
    //If lower, computer informs user that the guess is too low.
    //If higher, computer informs user that the guess is too high.
    //Go back to step 2.
    //Inform user that the user has guessed correctly and won. Game ends.

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int guesser = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-100"));


    }

}