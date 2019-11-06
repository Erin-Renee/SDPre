import java.util.Scanner;

public class ShallowGrandmother {   // Ex 14: Compound Boolean Expressions pg 62
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.print( "Enter your age: " );
    age = keyboard.nextInt();

    System.out.print( "Enter your yearly income: " );
    income = keyboard.nextDouble();

    System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
    cute = keyboard.nextDouble();

    System.out.print( "How happy do you make them, on a scale from 0.0 to 10.0? " );
    happy = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );    // && is AND  || is OR
    allowed2 = ( age > 25 && age < 40 && ( happy >= 7 || allowed ) );
    System.out.println( "Allowed to date my grandchild? " + allowed2 );


  }
}
/*
Study drill
added in a question on line 19, a variable called happy, and a
boolean variable called allowed2.
This allows for a true response if the person is in the correct age range
and makes them happy even if they did have enough money or not cute enough.


*/
