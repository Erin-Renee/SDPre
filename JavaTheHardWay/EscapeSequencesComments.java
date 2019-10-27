public class EscapeSequencesComments {
  public static void main( String[] args ) {
    // This exercise demonstrates escape sequences & comments (like these)!
    System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
    System.out.print( "\tLearn Java The \"Hard\" Way! \n" );
    // System.out.frimp( "learn Java The Hard Way");
    System.out.print( "Hello\n" ); // This line prints Hello.
    System.out.print( "Jello\by\n" ); // This line prints Jelly.
    /* The quick brown fox jumped over a lazy dog.
      Quick wafting zephyrs vex bold Jim. */
    System.out /* testing */.println( "Hard to believe, eh?" );
    System.out.println( "Suprised? /* abcde */ Or what did you expect?" ); //strings take precedence over block comments
    System.out.println( "\\ // -=- \\ //" );
    System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
    System.out.println( "I hope you understand \"escape sequences\" now.\n" );
    // and comments. ;)
  }
}
// Did not compile because of line 13 with a block comment in the middle of println
