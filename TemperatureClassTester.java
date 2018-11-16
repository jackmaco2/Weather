/*
This class will test most of the functionality of the 
Temperature class that you need to create.  It is not meant
to be a comprehensive test; that will be done with WebCAT
submissions. This class tests basic functionality of 
calling methods and getting some basic values back.  It does
not directly test the ranges. You can add test code in here
to test for values out of range.
*/


public class TemperatureClassTester {

   public static void main(String[] args) {

      // #############################################
      
      // uncomment line below to test default constructor
      
       Temperature a = new Temperature();
      
      // uncomment line below to test specific constructor
      
      Temperature b = new Temperature(30,'c');
      Temperature c = new Temperature(125,'F');
      
      // uncomment lines below to test the getTemp() and
      // getScale() methods

/*      
      System.out.printf("This should be 0 as a double: %f\n", a.getTemp());
      System.out.printf("This should be 30 as a double: %f\n", b.getTemp());
      System.out.printf("This should be 125 as a double: %f\n", c.getTemp());
      
      System.out.printf("This should be capital C: %c\n", a.getScale());
      System.out.printf("This should be capital C: %c\n", b.getScale());
      System.out.printf("This should be capital F: %c\n", c.getScale());
      
      System.out.println();
*/
      
      // uncomment the following lines to test setTemp()

/*      
      a.setTemp(40.6);
      b.setTemp(21.12);
      c.setTemp(-12.21);
      
      System.out.printf("This should be 40.6 as a double: %f\n", a.getTemp());
      System.out.printf("This should be 21.12 as a double: %f\n", b.getTemp());
      System.out.printf("This should be -12.21 as a double: %f\n", c.getTemp());
      
      System.out.println();
*/
      
      // uncomment the following lines to test setScale()

/*      
      a.setScale('F');
      b.setScale('F');
      c.setScale('C');

      System.out.printf("This should be 105.08 as a double: %f\n", a.getTemp());
      System.out.printf("This should be 70.016 as a double: %f\n", b.getTemp());
      System.out.printf("This should be -24.561111 as a double: %f\n", c.getTemp());
      
      System.out.println();
*/
      
      // uncomment the following lines to test the toString() method

/*      
      System.out.println("This is a: " + a );
      System.out.printf("This is b: %s\n", b );
      System.out.println("This is c: " + c );

      System.out.println();
*/      
      // uncomment the following lines to test equals()

/*      
      Temperature d = new Temperature(42.42, 'C');
      Temperature e = new Temperature(42.42, 'c');
      Temperature f = new Temperature(42.42, 'F');
      Temperature g = new Temperature(42.42, 'f');
      Temperature h = new Temperature(42, 'c');
      Temperature i = new Temperature(42, 'f');
      
      
            
      if ( d.equals(e) ) {
         System.out.println("equals() works for d and e (both C degrees)");
      }
      else {
         System.out.println("equals() DOES NOT WORK for d and e (both C degrees)");
      }
      if ( f.equals(g) ) {
         System.out.println("equals() works for f and g (both F degrees)");
      }
      else {
         System.out.println("equals() DOES NOT WORK for f and g (both F degrees)");
      }
      if ( d.equals(h) ) {
         System.out.println("equals() DOES NOT WORK for d and h (both C degrees)");
      }
      else {
         System.out.println("equals() works for d and h (both C degrees)");
      }

      if ( f.equals(i) ) {
         System.out.println("equals() DOES NOT WORK for f and i (both F degrees)");
      }
      else {
         System.out.println("equals() works for f and i (both F degrees)");
      }

*/
      

   }

}