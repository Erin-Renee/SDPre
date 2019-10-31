import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, lbs, bmi, ft, a, b, x, y, z, in;

    a = 0.0254;
    x = 12;
    b = 2.20;

    System.out.println( "How tall are you? Please enter your height in feet, then enter the inches separately." );
    System.out.print( "your height in feet: " );
    ft = keyboard.nextDouble();

    System.out.print( "your height in inches: " );
    in = keyboard.nextDouble();
    y = (ft*x);
    z = in + y;
    m = z*a;

    System.out.print( "your weight in pounds: " );
    lbs = keyboard.nextDouble();
    kg = (lbs /b);
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
