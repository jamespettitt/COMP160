import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Shape.java
 * James Pettitt, 2018
 * Lab 21
 */

public class Shape{
  private int x, y, width, height;
  private Color colour;
  
  /** shape constructor, sets shape values to random values */
  public Shape() {
    
    this.width = randomRange(10, 30);
    this.height = width;
    this.x = randomRange(0, (400-width));
    this.y = randomRange(0, (400-height));
    this.colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
  }
  
  /** finds a random number between lo and hi*/ 
  public int randomRange( int lo, int hi ){
    Random generator = new Random();
    return generator.nextInt(hi-(lo+1)) + lo;
  }
  
  /** draws the circle */
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}