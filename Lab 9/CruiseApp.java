/** application class for Customer.java
  * Lab 9 COMP160
  */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CruiseApp{
   
   public static void main(String[]args){
      //each Customer created with name, age, showed student ID card
      Customer customer1 = new Customer("Aaron Stott",17, true);
      Customer customer2 = new Customer("Betty Adams",17, false);
      Customer customer3 = new Customer("Corin Child",16, true);
      Customer customer4 = new Customer("Doris Stewart",25, true);
      Customer customer5 = new Customer("Edmond Cheyne",12, false);
      Customer customer6 = new Customer("Fiona Chaney",7, false);
      Customer customer7 = new Customer("Ged Still-Child",16, true);
      Customer customer8 = new Customer("Harry Adamson",20, false);
      confirmBooking(customer1); 
      confirmBooking(customer2);
      confirmBooking(customer3);
      confirmBooking(customer4); 
      confirmBooking(customer5); 
      confirmBooking(customer6);
      confirmBooking(customer7);
      confirmBooking(customer8);
      
      bookedCustomer(customer1);
      bookedCustomer(customer2);
      bookedCustomer(customer3);
      bookedCustomer(customer4);
      bookedCustomer(customer5);
      bookedCustomer(customer6);
      bookedCustomer(customer7);
      bookedCustomer(customer8);
   }
   
   
   /* 
    * for each customer, their meal price gets set by comparing the standard meal price to the customer's type of ticket
    * next, the ticket price gets set by comparing the standard ticket price to the customer's type of ticket
    * the customer's details get printed, and whether or not the user wants to confirm that booking
    * if the first character of the input is Y or y, the booking gets confimed
    */
   public static void confirmBooking(Customer customer) {
      
      DecimalFormat df = new DecimalFormat("#.00");
      
      double tickPrice;
      double standTickPrice = 56.0;
      double studTickPrice = (standTickPrice * 0.5);
      double discTickPrice = (standTickPrice * 0.8);
      
      //declaring the meal prices
      double mealPrice;
      double standMealPrice = 30.0;
      double childMealPrice = (standMealPrice * 0.5);
      double discMealPrice = (standMealPrice * 0.9);
      
      //sets the customers meal price
      if (customer.isChild() ) {
         mealPrice = childMealPrice;
         tickPrice = studTickPrice;
      } else {
         mealPrice = discMealPrice;
         tickPrice = discTickPrice;
      }
      
      //sets the customers ticket price
      if (customer.isStudent()) {
         tickPrice = studTickPrice;
         mealPrice = discMealPrice;
      } else {
         tickPrice = discTickPrice;
      }
      
      //calculates the customer's total price
      double totalPrice = (mealPrice + tickPrice);
      
      System.out.println(customer.getName());
      System.out.println("Ticket Price: $" + df.format(tickPrice));   
      System.out.println("Meal Price: $" + df.format(mealPrice));
      System.out.println("Total Price: $" + df.format(totalPrice));
      
      //asks for an input, only scans the first character
      Scanner reader = new Scanner(System.in);
      System.out.println("Confirm booking for " + customer.getName() + " (Y/N)");
      char c = reader.next().charAt(0);    
      
      //if first character is y, confirm the booking
      //else don't confirm the booking
      if (c == 'Y' || c =='y') {
         customer.setBooked(true);
         System.out.println("Booked");
      } else { 
         System.out.println("Not booked");
      }
      
      System.out.println();
   }
   
   /*
    * if the method isBooked in Customer.java is true, this method prints out the customer's name and that they are booked
    * else, nothing gets printed about the customer
    */
   public static void bookedCustomer(Customer customer) {
      if( customer.isBooked() ){
         System.out.println(customer.getName() + " is booked");
      }
   }
   
}