/*
This class will test most of the functionality of the 
Weather class that you need to create.  It is not meant
to be a comprehensive test; that will be done with WebCAT
submissions. This class tests basic functionality of 
calling methods and getting some basic values back.
*/

public class WeatherClassTester {

   public static void main(String[] args) {
      
      // uncomment the code below to test default constructor
      
       Weather a = new Weather();
 
      // uncomment code below to test specific constructor
      
       Weather b = new Weather(42.10,'F');
       Weather c = new Weather(12.21,'C');
      
      // uncomment the code below to test the getTemp() method
     
      Temperature d = a.getTemp();
      System.out.printf("This should print 0.0 degrees C: %s\n", d);
      
      Temperature e = b.getTemp();
      System.out.printf("This should print 42.1 degrees F: %s\n", e);

      Temperature f = c.getTemp();
      System.out.printf("This should print 12.21 degrees C: %s\n", f);
      


      // uncomment the code below to test the getHumidity() method
      
      // System.out.printf("Should print 50: %d\n", a.getHumidity());


      
      // uncomment the code below to test the getWindSp() method
      
      //System.out.printf("Should print 0: %d\n", b.getWindSp());      


      
      // uncomment the code below to test the getWindDir() method

/*      
      System.out.printf("Should print W: %s\n", c.getWindDir());
      
      // uncomment the code below to test setWindDir()
      String[] z = {"S","N","W","E","SE","SW","NE","NW"};
      
      for ( String y : z ) {
         c.setWindDir(y);
         System.out.printf("setWindDir with %s should be %s: %s\n", y, y, c.getWindDir());
      }
*/

      
      // uncomment the code below to test setWindSp()

/*      
      a.setWindSp(115);
      System.out.printf("Wind speed should be 115: %d\n", a.getWindSp());
*/

      
      // uncomment the code below to test setTemperature()

/*      
      Temperature g = new Temperature(90.3,'F');
      b.setTemperature(g);
      Temperature h = b.getTemp();
      System.out.printf("This should be 90.3 as a double: %f\n", h.getTemp());
*/

      // uncommment the code below to test toString()
      
      //System.out.println(c);
      
      // uncomment the code below to test equals()

/* 
      Weather m = new Weather();
      Weather n = new Weather(0,'C');
      Weather o = new Weather(12,'C');
      
      if (m.equals(n)) {
         System.out.println("equals() works for m and n");
      }
      else {
         System.out.println("equals() DOES NOT WORK for m and n");
      }
      if (m.equals(o)) {
         System.out.println("equals() DOES NOT WORK for m and o");
      }
      else {
         System.out.println("equals() works for m and o");
      }

*/

   }
   
}