import java.util.Scanner;

public class LetterCount {
   public static void main(String[]args) {
      //asks for a string
      Scanner reader = new Scanner(System.in);
      System.out.printf("Enter a string: %n");
      String sentence = reader.nextLine();
      
      int charCount = 0;
      int vowelCount = 0;
      int consCount = 0;
      
      char character;
      while(charCount <  sentence.length()) {
         
         character = sentence.charAt(charCount);
         
         if(Character.isLetter(character)){
            switch(character){
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
                  vowelCount++;
                  break;
                  
               default:
                  consCount ++;      
            }
         }
         
         charCount ++;
      }
      
      System.out.printf("Sentence is: %s%n", sentence);
      System.out.printf("Vowel count is: %s%n", vowelCount);
      System.out.printf("Consonant count is: %s%n", consCount);
   }
   
}
