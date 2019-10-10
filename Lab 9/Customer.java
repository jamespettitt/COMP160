/**  
 * Customer.java
 * Lab 9, COMP160 2018
 */

public class Customer {
   //data field declarations
   public String name;      //customer name
   public boolean child;    //customer age status
   public boolean student;  //customer student status
   public boolean booked;   //customer status
   
   public Customer(String nameIn, int age, boolean studentIn){
      name = nameIn;
      child = (age >= 5 && age <= 16);
      student = studentIn;
   }
   
   /**returns name
  *@return the customer's name */
   public String getName() {
      return name;
   }
   
   /**returns child
  *@return whether the customer is a child */
   public boolean isChild() {
      return child;
   }
   
   /**returns student
  *@return whether the customer is a student */
   public boolean isStudent() {
      return student;
   }
   
   /**returns booked
  *@return whether the customer is booked */
   public boolean isBooked() {
      return booked;
   }
   
   /**sets the value of the data field name to booked value
   *@param b is whether it is booked or not*/
   public void setBooked(boolean b) {
      booked = b;
   }
}