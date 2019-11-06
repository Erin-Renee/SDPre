import java.util.Scanner;

public class KeepGuessing {   //ex 27 Infinite Loops pg 101
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(Math.random()*10);

    System.out.println( "I have chosen a number between 1 and 10." );
    System.out.println( "Try to guess it." );
    System.out.print( "Your guess: " );
    guess = keyboard.nextInt();

    while ( secret != guess ) {   //program checks to see if secret != guess if it is it executes the body
            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();   //user inputs next guess
          }
//if secret == guess program will skip over loop
    System.out.println( "That's right! You're a good guesser." );
  }
}
// This program has an infinite loop
// CTRL-C to end the program.....

/*
 Study drill:
 while loops will keep going back to check to see if the condition
  in parenthesis is true or false. if it is true, it will execute the body and
  go back to check again until its eventually false.

  Why it became an infinite loop is because it didnt give the opportunity for
  the person to input the next guess. If there is not another input from the keyboard (line 18),
  then it will keep checking the last input from the keyboard.
  */
