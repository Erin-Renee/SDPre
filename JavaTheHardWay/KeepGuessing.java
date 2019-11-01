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

    while ( secret != guess ) {   //program checks to see if secret != guess
      System.out.println( "That is incorrect. Guess again." );
      System.out.print( "Your guess: " ); //if secret !=guess the program executes the body
    }
//if secret == guess program will skip over loop to line 19
    System.out.println( "That's right! You're a good guesser." );
  }
}
// This program has an infinite loop
// CTRL-C to end the program.....
