import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, in, lbs, bmi, a, b;

    System.out.print( "your height in inches: " );
    in = keyboard.nextDouble();
    a = 0.0254;
    m = in*a;

    System.out.print( "your weight in pounds: " );
    lbs = keyboard.nextDouble();
    b = 2.20;
    kg = (lbs /b);
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
