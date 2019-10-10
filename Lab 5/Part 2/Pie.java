import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2018 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,200));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      //your pie chart code goes here
      
      //page.drawArc(x, y, w, h, stA, aA);
      
      //declares variables for where the segments/arcs will go
      int x = 75;
      int y = 25;
      int w = 150;
      int h = 150;
      int a = 45
      
      //moves the rightmost segment up and across to the right
      page.setColor(Color.cyan);
      page.fillArc(x + 13, y - 5, w, h, 0, a);
      
      page.setColor(Color.red);
      page.fillArc(x, y, w, h, 45, a);
      
      page.setColor(Color.black);
      page.fillArc(x, y, w, h, 90, a);
      
      page.setColor(Color.yellow);
      page.fillArc(x, y, w, h, 135, a);
      
      page.setColor(Color.blue);
      page.fillArc(x, y, w, h, 180, a);
      
      page.setColor(Color.green);
      page.fillArc(x, y, w, h, 225, a);
      
      page.setColor(Color.orange);
      page.fillArc(x, y, w, h, 270, a);
      
      page.setColor(Color.pink);
      page.fillArc(x, y, w, h, 315, a);
      
      
    }
}
