import java.util.Scanner;

public class DictionaryOrder {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print( "Make up the name of a programming language! " );
    name = keyboard.nextLine();   //  .nextLine used to read in a String (if you have more than one word). .next() would stop reading after a space.
                                  // would store everything that was input until pressed enter and store it in name as one long string.
    if ( name.compareTo("c++") < 0 )
      System.out.println( name + " comes BEFORE c++" );
    if ( name.compareTo("c++") == 0 )
      System.out.println( "c++ isn't a made-up language!" );
    if ( name.compareTo("c++") > 0 )
      System.out.println( name + " comes AFTER c++" );

    if ( name.compareTo("go") < 0 )   // the string to the left (name) is compared to the string the right ("go") if they are identical in number of letters and same letters, it will set itself to 0
      System.out.println( name + " comes BEFORE go" );
    if ( name.compareTo("go") == 0 )
      System.out.println( "go isn't a made-up language!" );
    if ( name.compareTo("go") > 0 )                         //true when name >= go
      System.out.println( name + " comes AFTER go" );

    if ( name.compareTo("java") < 0 )
      System.out.println( name + " comes BEFORE java" );
    if ( name.compareTo("java") == 0 )    //true when name == java
      System.out.println( "java isn't a made-up language!" );
    if ( name.compareTo("java") > 0 )
      System.out.println( name + " comes AFTER java" );

    if ( name.compareTo("lisp") < 0 )
      System.out.println( name + " comes BEFORE lisp" );
    if ( name.compareTo("lisp") == 0 )
      System.out.println( "lisp isn't a made-up language!" );
    if ( name.compareTo("lisp") > 0 )
      System.out.println( name + " comes AFTER lisp" );

    if ( name.compareTo("python") < 0 )
      System.out.println( name + " comes BEFORE python" );
    if ( name.compareTo("python") == 0 )
      System.out.println( "python isn't a made-up language!" );
    if ( name.compareTo("python") > 0 )
      System.out.println( name + " comes AFTER python" );

    if ( name.compareTo("ruby") < 0 )
      System.out.println( name + " comes BEFORE ruby" );
    if ( name.compareTo("ruby") == 0 )
      System.out.println( "ruby isn't a made-up language!" );
    if ( name.compareTo("ruby") > 0 )
      System.out.println( name + " comes AFTER ruby" );

    if ( name.compareTo("visualbasic") < 0 )
      System.out.println( name + " comes BEFORE visualbasic" );
    if ( name.compareTo("visualbasic") == 0 )
      System.out.println( "visualbasic isn't a made-up language!" );
    if ( name.compareTo("visualbasic") > 0 )
      System.out.println( name + " comes AFTER visualbasic" );
    }
  }
