import javax.swing.*;
/**
 * DinerApp.Java
 * Comp160
 * James Pettitt 2018
 */
public class DinerApp{
  /** creates  an instance of the Diner class, puts it on a frame and sets some essential parameters.*/
  public static void main(String[]args){
    JFrame frame = new JFrame("Diner"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TablePanel dinner = new TablePanel();
    frame.getContentPane().add(dinner);
    frame.pack();
    frame.setVisible(true);
  }
}