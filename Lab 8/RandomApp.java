/** RandomApp.java Lab 8, Part 2, COMP160 2018
  * Displays a random integer between high and low limits * High and low values are typed in by the user.
  */
import java.util.Scanner; 
import java.util.Random; 


public class RandomApp{ 
   
   
   public static void main(String[]args){ 
      int lo = RandomRange.readInt("Enter lowest value");
      int hi = RandomRange.readInt("Enter highest value");
      RandomRange r = new RandomRange();
      System.out.println("Random integer between " + lo + " and " + hi + " : " + r.randomRange(lo, hi)); 
   }
   
}