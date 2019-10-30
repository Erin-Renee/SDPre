import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "what city is the capital of france?" );
    keyboard.next();

    System.out.println( "what is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println( "enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();

    System.out.println( "is there anything else you would like to say?" );
    keyboard.next();
  }
}

// The second question blows up when I typed in 2.3
// The third question blew up when I typed in cheese
