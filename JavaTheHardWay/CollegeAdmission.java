import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println( "Welcome to the UT Austin College Admissions Interface!" );
    out.print( "Please enter your SAT math score (200-800): " );
    math = keyboard.nextInt();

    out.print( "Admittance status: " );

    if ( math >= 790 )
      out.print( "CERTAIN " );
    else if ( math >= 710 )
      out.print( "SAFE " );
    else if ( math >= 580 )
      out.print( "PROBABLE " );
    else if ( math >= 500 )
      out.print( "UNCERTAIN " );
    else if ( math >= 390 )
      out.print( "UNLIKELY " );
    else // below 390 DENIED
      out.print( "DENIED " );

      out.println();
    }
}


/* import static java.lang.System.*;
    -shortcut that imports everything from inside the class
    java.lang.System into the current namespace. It is not needed to name System
    in System.out.print() with this import.

    Curly brackets are omitted because if statements are only one line of code,
    and because the if statements are in order. */
