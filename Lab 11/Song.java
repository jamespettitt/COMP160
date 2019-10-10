public class Song {
   private String songLine; //declares String songLine
   
   public Song( String songLine ){
      this.songLine = songLine;
   }
   
   /**returns the value of songLine
  *@return line of the song */
   public String toString() {
      return songLine;
   }
   
   /*
    * uses local variables to store information about where the second space is, so the string gets split into two
    * stores information about where the third space is, so it can find the letter straight after that, which is the first letter of the third word
    * 
    */
   public void process() {
      int secondSpace = songLine.indexOf(' ', (songLine.indexOf(' ') + 1));
      
      if(secondSpace != -1) {
         String firstTwoWords = songLine.substring(0, secondSpace);
         String rest = songLine.substring(secondSpace);
         System.out.printf("First two words: %s%n",firstTwoWords);
         System.out.printf("Rest of the words: %s%n",rest.substring(1));
      }
      
      int thirdSpace = songLine.indexOf(' ', (songLine.indexOf(' ') + 2));
      char firstLetterThirdWord = songLine.charAt(thirdSpace + 1);
      
      int firstOccurance = songLine.indexOf('b');
      
      System.out.printf("Length is: %d%n", songLine.length());
      
      System.out.printf("Last character is: %c%n", songLine.charAt(songLine.length() - 1) );
      
      System.out.printf("First letter of the third word: %c%n",firstLetterThirdWord);
      
      System.out.printf("Replaced spaces with x's: %s%n", songLine.replace(" ", "x"));
      
      System.out.printf("Uppercase: %s%n", songLine.toUpperCase());
      
      System.out.printf("Index of first occurence of 'b': %d%n%n", firstOccurance);
      
   }
   
}