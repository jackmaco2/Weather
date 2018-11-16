/*
This class will test most of the functionality of the 
Season class that you need to create.  It is not meant
to be a comprehensive test; that will be done with WebCAT
submissions. This class tests basic functionality of 
calling methods and getting some basic values back.
*/



public class SeasonClassTester {

   public static void main(String[] args) {
      
      // uncomment line below to test constructor call
      Season turnTurnTurn = new Season();
      
      // ############################################################# 
      
      // Uncomment lines below to test getSeason() method
      // Output should be "winter", all lowercase


      String a = turnTurnTurn.getSeason();
      System.out.println("This should be winter: " + a + "\n");
      if ( a.equals("winter")) {
         System.out.println("Constructor and getSeason() are correct!");
      }
      else {
         System.out.println("Constructor and/or getSeason() are NOT correct!");
      }
      System.out.println();


      // ############################################################# 
            
      // Uncomment lines below to test your setSeason() method


      turnTurnTurn.setSeason("holiday");
      if ( turnTurnTurn.getSeason().equals("winter")) {
         System.out.println("setSeason(\"holiday\") works correctly!");
      }
      else {
         System.out.println("setSeason(\"holiday\") DOES NOT work correctly!");
      }
      System.out.println();
   
      String[] sTemps = { "WiNtEr", "summer", "SPRING", "sPrinG", "SuMmER", "Fall", "fall", "AuTUMN", "autumn" };
   
      for ( String seaTemp : sTemps ) {
         System.out.printf("Attempting to set %s ...\n", seaTemp);       
         turnTurnTurn.setSeason(seaTemp);
         if ( turnTurnTurn.getSeason().equals(seaTemp)) {
            System.out.printf("\tsetSeason(\"%s\") works correctly!\n",seaTemp);
         }
         else {
            System.out.printf("\tsetSeason(\"%s\") DOES NOT work correctly!\n",seaTemp);
         }
      }
      System.out.println();



      // ############################################################# 

      
      // Uncomment the following code section to test the toString() method
      //System.out.printf("This should be autumn: %s\n\n", turnTurnTurn);


      // ############################################################# 

      // Uncomment the following code section to test the equals() method

      Season theByrds = new Season();
      turnTurnTurn.setSeason("winter");
      
      if ( theByrds.equals(turnTurnTurn) ) {
            System.out.printf("equals works correctly when they're both winter!\n");
      }
      else {
            System.out.printf("equals DOES NOT work correctly when they're both winter!\n");
      }
   
      if ( theByrds.equals(turnTurnTurn) ) {
            System.out.printf("equals DOES NOT WORK correctly when they're different!\n");
      }
      else {
            System.out.printf("equals works correctly when they're different!\n");
      }

      turnTurnTurn.setSeason("fall");
      theByrds.setSeason("autumn");
      
      if ( theByrds.equals(turnTurnTurn) ) {
            System.out.printf("equals works correctly when they're fall and autumn!\n");
      }
      else {
            System.out.printf("equals DOES NOT WORK correctly when they're fall and autumn!\n");
      }

      turnTurnTurn.setSeason("autumn");
      theByrds.setSeason("fall");
      
      if ( theByrds.equals(turnTurnTurn) ) {
            System.out.printf("equals works correctly when they're autumn and fall!\n");
      }
      else {
            System.out.printf("equals DOES NOT WORK correctly when they're autumn and fall!\n");
      }


      

   }


}