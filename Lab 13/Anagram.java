/*
 * Anagram.java
 * COMP160 2018
 * James Pettitt
 */
import java.util.Scanner;

/*
 * Asks for 2 sentences, sorts them and runs an if method to see if they are equal
 * If they are, they are an anagram
 */
public class Anagram {
   public static void main(String[]args) {
      //asks for a string
      Scanner reader = new Scanner(System.in);
      System.out.printf("Enter a string: %n");
      String sentence = reader.nextLine().toLowerCase();
      String sorted1 = sort(sentence);

      System.out.printf("Enter a string: %n");
      String sentence2 = reader.nextLine().toLowerCase();
      String sorted2 = sort(sentence2);
    
      System.out.printf("%s are the letters of %s in alphabetical order%n", sentence, sorted1);
      System.out.printf("%s are the letters of %s in alphabetical order%n%n", sentence2, sorted2);
      
      if(sorted2.equals(sorted1) ){
         System.out.println("They are anagrams");
      } else {
         System.out.println("They are NOT anagrams");
      }
     
   }
   
   /**returns sorted
  *@return the sorted sentence in alphabetical order */
   public static String sort(String sentence){
      String sorted ="";
       for (char c = 'a'; c < 123; c ++) {
         for ( int i = 0; i < sentence.length(); i ++ ) {
            if (Character.isLetter(sentence.charAt(i)) && (c == sentence.charAt(i) ) ) {
               sorted += c;
            }
         }
      }
       return sorted;
   }
   
}