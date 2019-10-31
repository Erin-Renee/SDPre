import java.util.Scanner;

public class GenderTitles {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String title;

    System.out.print( "First name: " );
    String first = keyboard.next();
    System.out.print( "Last name: " );
    String last = keyboard.next();
    System.out.print( "Gender (M/F): " );
    String gender = keyboard.next();
    System.out.print( "Age: " );
    int age = keyboard.nextInt();

    if ( age < 20 ) {
      title = first;
    }
    else {
      if ( gender.equals("F") ) {
        System.out.print( "Are you married, "+first+"? (Y/N): " );
        String married = keyboard.next();
        if ( married.equals("Y") ) {
          title = "Mrs.";
        }
        else {
            title = "Ms.";
        }
      }
      else {
          title = "Mr.";
      }
    }

    System.out.println( "\n" + title + " " + last );
  }
}

/*
Study Drill # 1:
    if you change the else on line 31 to an if statement, the human could type
     something besides "M" or "F" and neither if statement would be true. With
     the else statement, title has a value no matter what path is taken.You keep
     the if statement you can fix the error by initalizing totle right when you declare it.
*/
/*
instead of declaring variables at the beginning, they are defined
on the same line the value was put into them for the first time. (except title0)

You do not have to declare a variable until you're ready to use it.

Scope - refers to the places in your program where a variable is visible.
Title was still declared at the beginning of the program instead of on line 18 because
if put on line 18 it would only be seen in that body and not in scope for the rest of
the program.
It is helpful to declare a variable on the same line where its initial value is given
if you only want it used in that specific body and not the rest of the program.
*/
