import java.util.Scanner;

public class BooleanExpressions {   //Ex 12 Boolean Expressions pg 57
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    boolean a, b, c, d, e, f;
    double x, y;

    System.out.print( "give me two numbers. First: ");
    x = keyboard.nextDouble();
    System.out.print( "second: " );
    y = keyboard.nextDouble();

    a = (x < y);
    b = (x <= y);
    c = (x == y);
    d = (x != y);
    e = (x > y);
    f = (x >= y);

    System.out.println( x + " is LESS THAN " + y + ": " + a );    //true
    System.out.println( x + " is LESS THAN / EQUAL TO " + y + ": " + b ); //true
    System.out.println( x + " is EQUAL TO " + y + ": " + c );   //false
    System.out.println( x + " is NOT EQUAL TO " + y + ": " + d );   //true
    System.out.println( x + " is GREATER THAN " + y + ": " + e ); //false
    System.out.println( x + " is GREATER THAN / EQUAL TO " + y + ": " + f );  //false
    System.out.println();

    System.out.println( !(x < y) + " " + (x >= y) ); //false false    // "not" operator is !   takes the logical OPPOSITE
    System.out.println( !(x <= y) + " " + (x > y) );  //false false
    System.out.println( !(x == y) + " " + (x != y) ); //true true
    System.out.println( !(x != y) + " " + (x == y) ); // false false
    System.out.println( !(x > y) + " " + (x <= y) );  //true true
    System.out.println( !(x >= y) + " " + (x < y) ); //true true
  }
}

/*
STUDY DRILL
1.
less than is <
greater than is >
less than or equal to is <=
greater than or equal to is >=
equal to is ==
not equal to is !=
*/
