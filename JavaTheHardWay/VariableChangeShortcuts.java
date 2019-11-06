public class VariableChangeShortcuts {    //Ex 11 Variable Modification shortcuts pg 53
  public static void main( String[] args ) {
    int i, j, k;

    i = 5;
    j = 5;
    k = 5;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k ); //prints i:5 j:5 k:5
    i = i + 3;    //8
    j = j - 3;    //2
    k = k * 3;    //15
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" ); //prints  i:8 j:2 k:15

    i = 5;    //variables reset to the values we initially gave them
    j = 5;
    k = 5;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );  //prints i:5 j:5 k:5
    i += 3;   //same as i = i + 3   shortcut called "compound assignment operator"
    j -= 3;   //minus equals
    k *= 3;   //multiplies
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" ); //prints  i:8 j:2 k:15

    i = j = k = 5;    //a shortcut to assign all variables a value of 5
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );  //prints i:5 j:5 k:5
    i += 1;
    j -= 2;
    k *= 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tK: " + k + "\n" );   //prints i:6 j:3 k:15

    i = j = 5;
    System.out.println( "i: " + i + "\tj: " + j );    // prints i:5 j:5
    i =+ 1; //+= is backwards!
    j =- 2; //backwards as well
    System.out.println( "i: " + i + "\tj: " + j + "\n" );

    i = j = 5;
    System.out.println( "i: " + i + "\tj: " + j );    // prints i:5 j:5
    i++;    //post-increment operator "add one to the value in i"
    j--;    //post-decrement operator "subtract 1 from the value in j"
    System.out.println( "I: " + i + "\tj: " + j + "\n" );

    i = 5;
    System.out.println( "i: " + i );  // i:5
    i -= 5;
    System.out.println( "I: " + i + "\n" ); // i:0

    i = 5;
    System.out.println( "i: " + i );  // i:5
    i++;
    i++;
    i++;
    i++;
    i++;
    System.out.println( "I: " + i + "\n" ); // i:10
  }
}
/*
i =+ 1;     This is i = 1 not i += 1
j =- 2;     this is j = -2 not j -= 2


STUDY DRILLS:
1. Add code at bottom that resets i's value to 5. Then, on the next line, use
only -= to change i's value to 0. Then on the next line after that display i's
new value on the screen.
line 42-45

2. Add code below the other Study drill that resets i's value to 5, then using
only ++, change i's value to 10 and display it again. YOu may change the value
using several lines of code or with just one line if you can figure it out.
line 47-54




*/
