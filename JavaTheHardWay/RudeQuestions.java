import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, food;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? Thats not very old." );
    System.out.print( "how much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.print( name + ", what is your favorite food?" );
    food = keyboard.next();

    System.out.println( "Wow! " + food + " is my favorite too!" );
    System.out.print( "Well thanks for answering my rude questions, " );
    System.out.println( name + "." );


  }
}
/* Study Drills
      1. No, the program doesnt blow up if you enter an integer value instead
      of a double. If i input an integer like 200 when it asks my income,
      the scanner object will store it as a floating point or 200.0. Therefore when
      the computer runs the line that tells it to print the variable called income,
      it will print the stored floating point of 200.0

      2. no, the program doesnt blow up if i enter a numeric value instead of a
      String. My guess why it doesnt is because since a string holds words and
      phrases, it will store "3" as a string and not an integer that has numeric
      value.

      3. The first question is a string, so it did not crash when integers,
      doubles, or strings were submitted. the second question "How old are you?"
      I could make it crash by typing the word cheese, and also a double like 23.5.
      The program was expecting an integer or whole number and it cannot store
      fractions, words or prases.

      4. I added a new sting asking the user to input their favorite food. line 28, 29, 31
      */
