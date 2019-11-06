import java.util.Scanner;

public class ComparingNumbers {   // Ex: 16 More If Statements pg 67
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second )
      System.out.println( first + " is LESS THAN " + second );

    if ( first <= second )
      System.out.println( first + " is LESS THAN/EQUAL TO " + second);

    if ( first == second )
      System.out.println( first + " is EQUAL TO " + second );

    if ( first >= second )
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );

    if ( first > second )
      System.out.println( first + " is GREATER THAN " + second );

    if ( first != second ) {
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "hey.");
    }
  }
}

/*
STUDY Drills
1. "hey" will print no matter what because the "hey." is not in curly brackets
to be included in the if statement. The if statement does not need curly
brackets if the body code is only one line. Anything more than one line needs
curly brackets.

2.  Curly brackets removed off of all if statements except for last one. If the
 body is more than one line, it needs curly brackets to include it in that if statement.
*/
