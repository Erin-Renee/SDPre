public class ClubBouncer {    //Ex 17 Otherwise (If Statements with Else) pg 69
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
/*
STUDY Drill
1.  No putting System.out.println("Hello"); statement on line 11 would not compile. This is
because the print statement is not inside the if's code body. It then disrupts
 the if/else code.
*/
