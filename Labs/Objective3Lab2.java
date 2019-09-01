import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args) {

    String Name;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("whats your name?");
    Name = keyboard.next();

    System.out.println("Hello " + Name);
    keyboard.close();
  }
}
