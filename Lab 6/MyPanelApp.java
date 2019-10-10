import javax.swing.*;
import java.awt.*;
/**  
 * MyPanel.java
 * Lab 6, COMP160 2018
 * Make our own version of a JPanel class
 */
public class MyPanelApp {
   
public static void main(String[]args){
   MyPanel mp1 = new MyPanel();
   mp1.decorate(Color.blue, 180);
   
   MyPanel mp2 = new MyPanel();
   mp2.decorate(Color.green, 500);
   
   
}

}//end class
