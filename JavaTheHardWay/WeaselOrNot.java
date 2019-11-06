import java.util.Scanner;

public class WeaselOrNot {  //ex 13 Comparing Strings
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "type the word \"weasel\", please." );
    word = keyboard.next();

    yep = "weasel".equals( word );
    nope = ! word.equals("weasel");
    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );
  }
}
/*
Study DRILL
1.  changed the comparison on line 12 so that "weasel" is in front od the dot
and equals is inside parenthesis. The code worked, and ran the same. I think
this is because the equals() compares the string on the left to the one on the
right or vice versa, it doesnt matter which side it is on.
*/
