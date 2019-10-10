import java.util.Scanner;

/**
 * GuessFruits.Java
 * James Pettitt, 2018
 * Lab 16
 * Given the first 2 letters of a fruit that you stored in the array and need to guess what the fruit is from the 2 letters
 * Can change the amount of fruits to guess
 */

public class GuessFruits {
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      String[] fruits = new String[3];
      
      //repeats for how many elements need to be stored in fruits array (3)
      for (int j = 0; j < fruits.length; j++ ) { 
         System.out.printf("Enter a fruit: %n");   //asks for a fruit and adds it to the array
         fruits[j] = reader.nextLine(); //stores the input in fruits[j]
      }
      
      //repeats for many elements are stored in fruits
      for (int i = 0; i < fruits.length; i++) {
         String fruit = fruits[i]; //creates a string initialised as fruits at element [i]
         System.out.printf("Guess what fruit I am?   %s%n", fruit.substring(0, 2)); //shows the first 2 letters of fruits[i]
         String guess = reader.nextLine();
         while( !(guess.equals(fruits[i]))) { //repeats until it is correct
            System.out.println("Try again!");
            guess = reader.nextLine(); 
         }
         System.out.println("Correct!");
      }
      
      
   }//end main method
   
   
} //end class