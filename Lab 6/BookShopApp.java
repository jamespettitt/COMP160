import javax.swing.*;
import java.awt.*;
/**  
 * MyPanel.java
 * Lab 6, COMP160 2018
 * Make our own version of a JPanel class
 */
public class BookShopApp {
   
public static void main(String[]args){
   Book b1 = new Book();
   b1.setTitle("Life of Pi");
   b1.setPages(348);
   b1.setPrice(28.90);
      
   Book b2 = new Book();
   b2.setTitle("Mister Pip");
   b2.setPages(240);
   b2.setPrice(22.70);
   
   Book b3 = new Book();
   b3.setTitle("The Big Book");
   b3.setPages(411);
   b3.setPrice(9.50);
   
   b1.displayBook();
   b2.displayBook();
   b3.displayBook();
    

}

}//end class
