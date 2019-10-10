/**  
 * LeapCalc.java
 * Lab 10, COMP160 2018
 */

public class LeapCalc {
   public static void main(String[]args){
      leapYear(2014);
      leapYear(2016);
      leapYear(1900);
      leapYear(2000);
      leapYear(1565);
   }
   
   /*
    *This method declares a boolean to see if the year is a leap year or not,
    * initially it tests to see if it is divisible by 4, then it sets it to true
    * Unless it is divisible by 100 but not by 400, in which case it is not a leap year
    * 
    * Finally it checks the boolean (and whether it predates the Gregorian calculator) 
    * before outputting whether or not the year given is a leap year or not
    */
   public static void leapYear(int year) {
      
      boolean isLeapYear = false;
      
      if (year % 4 == 0 ) {
         isLeapYear = true;
      } 
      if ( (year % 100 == 0) && (year % 400 != 0 ) ){ 
         isLeapYear = false;
      }
      
      
      if (isLeapYear) {
         System.out.printf("%d: is a leap year%n", year);
      } else if (year < 1582) {
         System.out.printf("%d: predates the Gregorian calendar%n", year);
      }  else {
         System.out.printf("%d: is not a leap year%n", year);
      }  
   }
}
