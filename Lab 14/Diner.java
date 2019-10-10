import javax.swing.*;
import java.awt.*;
/**
 * Diner.Java
 * Comp160
 * James Pettitt 2018
 */
public class Diner {
   //declares data fields representing variables given about each diner
   private int x;
   private int y;
   private String name;
   private int seatNum;
   private Color colour;
   private final int DIAMETER = 50;
   
   //constructor to set the data fields to the value of it's parameters
   public Diner( int x, int y, String name, int seatNum, Color colour) {
      this.x = x;
      this.y = y;
      this.name = name;
      this.seatNum = seatNum;
      this.colour = colour;
   }
   
   /*
    * uses the Graphics object to draw itself and use the variables 
    * about each diner to create a graphic representing each diner
    */
   public void draw (Graphics g) {
      g.setColor(colour);  
      g.fillOval(x, y, DIAMETER, DIAMETER);
      
      g.setColor(Color.black);
      g.setFont(new Font ("Courier", Font.PLAIN, 13));
      
      g.drawString(name, (x+5), (y+27));
      
      g.setFont(new Font ("Courier", Font.PLAIN, 10));
      
      g.drawString(String.valueOf(seatNum), (x+23), (y+12));
   }


     
   
   
}