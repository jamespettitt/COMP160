import javax.swing.*;
/**
 * DrawTriangleApp.java 
 * James Pettitt 2018
 * Lab 25
 */

public class DrawTriangleApp{
  /** creates  an instance of the DrawTrianglePanel class, puts it on a frame and sets some essential parameters.*/
  public static void main(String[]args){
    JFrame frame = new JFrame("DrawTriangle"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    DrawTrianglePanel trianglegrid = new DrawTrianglePanel();
    frame.getContentPane().add (trianglegrid);
    frame.pack();
    frame.setVisible(true);
  }
}