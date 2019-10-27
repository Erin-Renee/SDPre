public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, year;
    double seconds, e, checking, MPH;
    String firstName, lastName, title, pet, car;

    x = 10;
    y = 400;
    age = 39;
    year = 2019;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    MPH = 80.048;

    firstName = "Erin";
    lastName = "Eustice";
    title = "Ms.";
    pet = "Jasmine";
    car = " Toyota Supra";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A Favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + " " + lastName );
    System.out.println( "my pets name is " + pet + "." );
    System.out.println( "A car was seen speeding, It was a " + car );
    System.out.println( "The " + car + " was going " + MPH + " MPH" );
  }
}
