import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("Let's play a game.");
        System.out.println("1 and 100.");
        boolean playAgain;
        do {
            playGame();  
            System.out.print("Would you like to play again? ");
            playAgain = TextIO.getlnBoolean();
        } while (playAgain);
        System.out.println("Thanks for playing.  Goodbye.");
    }            

    
    
    static void playGame() {
        int computersNumber; 
        int usersGuess;     
        int guessCount;    
        computersNumber = (int)(100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.print("What is your first guess? ");
        while (true) {
            usersGuess = TextIO.getInt();
            guessCount++;
            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount
                        + " guesses!  My number was " + computersNumber);
                break;  
            }
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose.  My number was " + computersNumber);
                break; 
            }
        
            if (usersGuess < computersNumber)
                System.out.print("That's too low.  Try again: ");
            else if (usersGuess > computersNumber)
                System.out.print("That's too high.  Try again: ");
        }
        System.out.println();
    } 

} 
	
