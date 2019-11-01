import java.util.Scanner;

public class KeepGuessing {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(Math.random()*10);

    System.out.println( "I have chosen a number between 1 and 10." );
    System.out.println( "Try to guess it." );
    System.out.print( "Your guess: " );
    guess = keyboard.nextInt();

    while ( secret != guess ) {   //program checks to see if secret != guess if it is it executes the body
        if (guess != secret ) {
            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();   //user inputs next guess
          }
        }
//if secret == guess program will skip over loop

    System.out.println( "That's right! You're a good guesser." );
  }
}
// This program has an infinite loop
// CTRL-C to end the program.....

/*
 Study drill: Program needed if statement so it knows what to do if the variable
 secret is not equal to the variable guess. line 19 then lets the user input
 the next guess.
 */
