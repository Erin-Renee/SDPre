import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double number1, number2, result;




      System.out.println("Please enter a number: ");
      number1 = keyboard.nextDouble();

      System.out.println("Please enter another number: ");
      number2 = keyboard.nextDouble();

      result = number1 + number2;

      System.out.print( "The sum of " + number1 );
      System.out.print( " + " + number2 );
      System.out.println( " = " + result );
      keyboard.close();
  }
}
