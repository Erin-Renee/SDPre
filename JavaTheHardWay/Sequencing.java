import java.util.Scanner;

public class Sequencing {   // Exercise 10 Variables Only Hold Values  pg:50
  public static void main( String[] args ) {
    // THIS CODE IS BROKEN! Fixed in study drills!

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;    //defining a variable: when you declare and initalize a variable at the same time

//line 8-13 the value of price is still 0
    System.out.print( "How much is the purchase price? ");
    price = keyboard.nextDouble();    //the keyboard input is stored into price (initial value of zero is replaced.)

    salesTax = price * 0.0825;    //sales tax initialized/ given an initail value
    total = price + salesTax;
    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );    //when printed, value for SalesTax and total are zero because on line 10 and 11 price is set to 0
    System.out.println( "Total cost:\t" + total );
  }
}
// VARIABLES HOLD VALUES NOT FORMULAS!
/*
Study drills:

1. when =0 is removed on line 8, the program wont run. Price is no longer defined.

2. lines with salesTax and total were moved to line 14 and 15. On line 12,
a real value is given to price. salesTax and total need a value for price.

3. no, when i remove the =0 now i do not get an error message. It compiled
properly. I am not suprised because price needed an initial value before salesTax
and total could be run.  Moving salesTax and total to lines after price was given
a value eliminates the need to give price an initial value.



/*
import java.util.Scanner;

public class Sequencing {   // Exercise 10 Variables Only Hold Values  pg:50
  public static void main( String[] args ) {
    // THIS CODE IS BROKEN! Fixed in study drills!

    Scanner keyboard = new Scanner(System.in);
    double price = 0, salesTax, total;    //defining a variable: when you declare and initalize a variable at the same time

    salesTax = price * 0.0825;    //salesTax would be 0;      0 * 0.0825 = 0
    total = price + salesTax;   // total = 0 + 0
//line 8-13 the value of price is still 0
    System.out.print( "How much is the purchase price? ");
    price = keyboard.nextDouble();    //the keyboard input is stored into price (initial value of zero is replaced.)

    System.out.println( "Item price:\t" + price );    //price is what the user input aka $7.99
    System.out.println( "Sales tax:\t" + salesTax );    //when printed, value for SalesTax and total are zero because on line 10 and 11 price is set to 0
    System.out.println( "Total cost:\t" + total );    // total is 0
  }
}
*/
