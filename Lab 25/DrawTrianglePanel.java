import java.awt.*;
import java.awt.event.*; //added extra
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
/**
 * DrawTrianglePanel.java 
 * James Pettitt 2018
 * Lab 25
 */

public class DrawTrianglePanel extends JPanel{
  
   private JPanel gridPanel = new GridPanel();
   private JButton addTriangle, randomTriangle; 
   
   ArrayList<Triangle> triangles = new ArrayList<Triangle>();
  /** constructor method, sets up the Traffic panel */
  public DrawTrianglePanel(){
     setPreferredSize(new Dimension(1020,1050));
     setBackground(Color.blue);
     
     GridPanel gridPanel = new GridPanel();
     add(gridPanel);
     
     JPanel controlPanel = new JPanel();
     controlPanel.setPreferredSize(new Dimension(1000, 30));
     
     ButtonListener listener = new ButtonListener();    //makes an instance of the ButtonListener class
     
     //addTriangle = new JButton ("Add Triangle");
     randomTriangle = new JButton ("Add a Random Triangle");
     randomTriangle.addActionListener(listener);
     controlPanel.add(randomTriangle);
     
     //controlPanel.add(addTriangle);
     
     add(controlPanel);
    
  }//constructor
 
  /*inner private class that have the functionality of a JPanel
   * because of the extension. 
   */
  private class GridPanel extends JPanel {
     private int x1, y1, x2, y2;
     private int numLines;
     
    //GridPanel constructor to set up the panel dimension and colour
    public GridPanel(){
      setPreferredSize(new Dimension(600,600));
    }
    
    /* this draws the shapes
     */
    public void paintComponent (Graphics g){
      super.paintComponent(g); 
      
      numLines = (1000/50);
      x1 = 0;
      y1 = 0;
      x2 = 0;
      y2 = 1000;
      
      //vertical lines
      for( int i = 0; i <= numLines; i++ ){
         g.setColor(Color.red);
         g.drawLine(x1, y1, x2, y2);
         g.setColor(Color.black);
         g.drawString("" + x1, x1, 11);
         g.drawString("" + x2, x2, 1000);
         x1 += 50;
         x2 += 50;
      }
      
      x1 = 0;
      y1 = 0;
      x2 = 1000;
      y2 = 0;
      
      //horizontal lines
      for( int i = 0; i <= numLines; i++ ){
         g.setColor(Color.red);
         g.drawLine(x1, y1, x2, y2);
         g.setColor(Color.black);
         g.drawString("" + y1, 1, y1);
         g.drawString("" + y2, 975, y2);
         y1 += 50;
         y2 += 50;
      }
      
      if ( triangles.size() > 0 ) {
        for(int i = 0; i < triangles.size(); i++) {
          triangles.get(i).display(g);
          //triangles.get(i).showIndex(g, i);
        }
      }
    }
  }//GridPanel class
  
  /** represents a listener for button presses */
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == randomTriangle) {
         triangles.add(new Triangle());
      }
      
      repaint(); //refreshes the panel 
    }//actionPerformed
    
  }//buttonlistener class

  
  
}//TrafficLightPanelclass




