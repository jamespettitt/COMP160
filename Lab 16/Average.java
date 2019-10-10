/**
 * GuessFruits.Java
 * James Pettitt, 2018
 * Lab 16
 * Calculates and displays the average of each row of the 2d array table
 */

public class Average{
  public static void main(String[]args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};

    
    //loops for every element in table
    for(int i=0; i < table.length; i++){
      int[] currentElement = table[i]; 
      String outputString = ""; //initialises outputString string
      int totalValue = 0; //initialises totalValue int
      
       
      for(int j=0; j < currentElement.length; j++ ) {
        totalValue += currentElement[j]; //adds the current number to total value
        outputString += currentElement[j] + " "; //adds the current number to outputString
      }
      
      //finds the average by setting the ints into doubles and dividing
      double average = (double) totalValue / (double) currentElement.length;
      outputString += "Average: " + average;
      
      //prints the string for each section in table
      System.out.println(outputString);
      
    }
  } 
}