public class ThereAndBackAgain {    //Ex 33: Calling a Function
  public static void main( String[] args ) {
    System.out.println( "Here." );
    erebor();
    System.out.println( "Back first time." );
    //erebor();
    System.out.println( "Back second time." );
  }                               //end of body "main"

    public static void erebor() {   //function called erebor is defined
      System.out.println( "There." );
    }                             //end of body "erebor"
}
/*
STUDY DRILLS
1. what happens when you remove the parenthesis at the end of the first function
 call on line 4?
  the program will not compile. Without the parentesis it is no longer a function
   and is a variable that is not defined.
   2. When you take out the function on line 6 "erebor" it no longer prints "there".
   The original program runs:
   Here.
   There.
   back first time.
   there.
   back second time.

   edited version runs:
   Here.
   There.
   back first time.
   back second time.


*/
