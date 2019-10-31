import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {                            //while loops!
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}

/*
while loops are similar to an if statement. THey both hava a condition in the
parenthesis that is checked to see if it is true or false. If it is false, they both will skip all the code in the body.
The difference is that if statements are true will execute all of the code in curly brackets only once.
While loops will execute true statements then go back up to check it again over and over again until it eventually is false.
The wile loop will then move on to the rest of the code.
While loops prevent you from having to repeditively type out code....
*/
