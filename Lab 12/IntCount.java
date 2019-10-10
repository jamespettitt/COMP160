import java.util.Scanner;

public class IntCount {
   private static Scanner scanner = new Scanner( System.in );
   
   /*
    * method that reads an integer value and prints the sum of all even integers between minimum and 
    * the input value, esclusive. an error message is printed if the value is less than the minimum value
    */
   public static void main(String[]args) {
      int minimum = 2; //declares minimum value num can be
      
      //asks for a number
      Scanner reader = new Scanner(System.in);
      System.out.printf("Enter an integer greater than %d: %n", (minimum-1));
      int num = reader.nextInt();
      
      while(num < minimum) {
         System.out.printf("Input value must not be less than %d%n", (minimum));
         num = reader.nextInt();
      }
            
      int total = 0; //declares total sum
      int numToAdd = 0; //declares num to add to total
      while(numToAdd < num ){ 
         if(numToAdd % 2 == 0){   //only adds even numbers
            total += numToAdd;    //adds number to total
            //System.out.println(" num to add next: " + numToAdd+ " total: " + total );
         }
         
         numToAdd++; //puts up count by 1
      }
      
      System.out.printf("Sum of even numbers between %d and %d inclusive is: %d%n", minimum, num, total);
   }


}
