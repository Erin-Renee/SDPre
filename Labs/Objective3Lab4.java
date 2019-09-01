import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
      int age;
      String firstname;
      String lastname;



      System.out.println("What is your first name?");
      firstname = keyboard.next();

      System.out.println("What is your last name?");
      lastname = keyboard.next();

      System.out.println("What is your age?");
      age = keyboard.nextInt();

      System.out.print( "First Name:  " + firstname );
      System.out.print( ", Last Name: " + lastname );
      System.out.println( ", Age: " + age );
      keyboard.close();
  }
}
