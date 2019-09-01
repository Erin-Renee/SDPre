import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
      int birthYear, age, currentYear;

      currentYear = 2019;
      birthYear = 0;

      System.out.println("How old are you?");
      age = keyboard.nextInt();

      birthYear = currentYear - age;

      System.out.println("You were born in " + birthYear);
      keyboard.close();
  }
}
