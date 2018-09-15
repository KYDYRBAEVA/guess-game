import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("Let's play a game.");
        System.out.println("1 and 100.");
	Scanner game = new Scanner(System.in );
	int max;   
        max = inputnum.nextInt();
        do {
            playGame();  
            System.out.print("Would you like to play again? ");
        } while (playAgain);
        System.out.println("Thanks for playing.  Goodbye.");
    }            

    
    
    static void playGame() {
        int comNumber; 
        int usersGuess;     
        int guessCount;    
        comNumber = (int)(100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.print("What is your first guess? ");
        while (true) {
            usersGuess = TextIO.getInt();
            guessCount++;
            if (usersGuess == comNumber) {
                System.out.println("You got it in " + guessCount
                        + " guesses!  My number was " + comNumber);
                break;  
            }
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose.  My number was " + comNumber);
                break; 
            }
        
            if (usersGuess < comNumber)
                System.out.print("That's too low.  Try again: ");
            else if (usersGuess > comNumber)
                System.out.print("That's too high.  Try again: ");
        }
        System.out.println();
    } 

} 
	
