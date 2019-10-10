/*
 * IntCounterApp.java
 * James Pettitt
 * COMP160 2018
 */

import java.util.Scanner;
import java.util.Random;

public class IntCounterApp {
   
   /* main method that runs the loop 3 times
    * asks for an integer, makes an instance of the IntCounter class and gives it the array
    * calls the showTarget method in IntCounter class to display whether or not the target is found, and where
    */
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      
      for(int i = 0; i < 3; i++) {
         System.out.printf("Enter a target integer: %n");   //asks for a int to find the array
         int target = reader.nextInt();

         while( target > 4 || target < 0 ) {
            System.out.printf("Input value must not be less than 4%n");
            target = reader.nextInt();
         }
         
         IntCounter intcounter = new IntCounter(makeArray());   //makes an instance of the support class and sends it the array
         intcounter.showTarget(target);       //calls the showTarget method of this instance and sends it the target
      }
   } //end method
   
   
   
   
   
   
   /**returns values
  *@return an array that holds 5-10 random values between 0-4 */
   public static int[] makeArray() {
//      int values[] = new int[] {1,2,3,4,5,2};
      int min = 5;
      int max = 10;
      Random rand = new Random();
      int[] values = new int[rand.nextInt(max-min) + min];    //makes a new array with a random size between 5-10
      for (int i = 0; i < values.length; i++ ){
         values[i] = rand.nextInt(5);              //puts a random value between 0-4 into the index i
      }
      return values;
   }//end method
   
} //end class