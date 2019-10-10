/*
 * IntCounter.java
 * James Pettitt
 * COMP160 2018
 */

import java.util.Arrays;

public class IntCounter {
   private int[] numArray; //declares array of type int[]
   
   /*
    * 
    */
   public IntCounter(int[] numArray){
      this.numArray = numArray; //sets the value of the data field
      for( int i = 0; i < numArray.length; i++ ) {     
         System.out.printf("%d ", numArray[i]);                //display every element of the array 
      }                                                      
      System.out.printf("- length: %d%n", numArray.length);    //and the length
   } //end method
   
   
   
   
   /*
    * this method is called in the application class and the for loop checks whether the target int
    * is found anywhere in the string and where it is
    * if not, it prints that there are no 'target's in the array 
    */
   public void showTarget (int target){
      
//      System.out.printf("There is a %d in position: %d%n", target, Arrays.asList(numArray).indexOf(target));
//      for this to work, the array needs to be of type Integer[] , not int.
      
      //checks if the target integer is found in the array, and what the index of where the target is found
      int count = 0;
      for( int i = 0; i < numArray.length; i++ ) {
         if( numArray[i] == target) {
            System.out.printf("\tThere is a %d in index: %d%n", target, i);
            count ++;
         }
      }
      
      if (count == 0) {
         System.out.printf("\tThere are no %d's in this array%n", target);
      }
      System.out.println();
   } //end method
   
} //end class