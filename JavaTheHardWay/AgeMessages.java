import java.util.Scanner;

public class AgeMessages {    //Ex 15 Making Decisions with If statements
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    if ( age >= 13 ) {
      System.out.println( "\tOld enough to create a Facebook account" );
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age >= 16 ) {
      System.out.println( "\tOld enough to get a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }
    if ( age >= 18 ) {
      System.out.println( "\told enough to get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\tOld enough to drink alcohol" );
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
    }
    if ( age >= 35 ) {
      System.out.println( "\tOld enough to run for President of the U.S." );

    }
    if ( age < 65 ) {
    System.out.println( "\tToo young to retire! " );
    System.out.println( "\t\t(How sad!)" );
    }
    if ( age >= 65 ) {
      System.out.println( "\tYou are old enough to retire! " );
      System.out.println( "\t\t(How exciting!)" );
    }
  }
}
/*
Study DRILLS
1.  if you type in an age greater than 35 what gets printed. "you are" was
printed. All of the if statements were false, so it didnt print out any of the
code for those if statements. code on line 11 tells the program to print
"you are: ". This will print because it is not in the block code for one of the
if statments, it will print out "you are: " no matter the result of the if statements.

2. lines of code added on line 28 and 29. If you are over 65, you are old enough to retire!

3. For each if statement, i added anther if statement that says the opposite
*/






/*
if statements have a condition in parenthesis. The condition must be a boolean
expression that it can evaluate as true or false.
Below that is a block of code surrounded by curly brackets.
when the if statement is true, the program will execute the code inside of the
curly brackets.
if the condition is false, the program with skip the block of code and move
on to the next part of the code.
*/
