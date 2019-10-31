import java.util.Scanner;

public class ThirtyDays {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int month, days;
    String monthName;

    System.out.print( "Which month? (1-12) " );
    month = keyboard.nextInt();

    switch(month) {                   //not allowed to declare any variables inside the switch statement.
      case 1: monthName = "January";   //the case, the value that the variable in parenthesis (month) might equal, and code....
              break;                   //break marks the end of a case
      case 2: monthName = "February";
              break;
      case 3: monthName = "March";
              break;
      case 4: monthName = "April";
              break;
      case 5: monthName = "May";
              break;
      case 6: monthName = "June";
              break;
      case 7: monthName = "July";
              break;
      case 8: monthName = "August";
              break;
      case 9: monthName = "September";
              break;
      case 10: monthName = "October";
              break;
      case 11: monthName = "November";
              break;
      case 12: monthName = "December";
              break;
      default: monthName = "error";      //runs if none of the cases match.
}

/* All months hath 30 days except 5 months. September April, June and November
hath 30 days, and February hath 28 days.
*/

    switch(month) {
      case 9:
      case 4:
      case 6:
      case 11: days = 30;
              break;
      case 2: days = 28;
              break;
      default: days = 31;
    }
    System.out.println( days + " days hath " + monthName );

  }
}

/* When a switch statement runs the computer figures out the current value of
the variable inside the parenthesis. Once it finds a match, it runs the code until the break.
*/
