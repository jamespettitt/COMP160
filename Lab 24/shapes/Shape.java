package shapes; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public abstract class Shape{
  protected int x, y, width, height;
  protected Color colour;
  protected int moveX = 1;
  protected int moveY = 1;
  
  public Shape() {
    this.width = randomRange(10, 30);
    this.height = width;
    this.x = randomRange(0, (400-width));
    this.y = randomRange(0, (400-height));
    this.colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
  }
  
  public int randomRange( int lo, int hi ){
    Random generator = new Random();
    return generator.nextInt(hi-(lo+1)) + lo;
  }
  
  public abstract void display (Graphics g );
  
  public void move() {
    //x += moveX;
    //y += moveY;
    
    if((x <= 0) || (x >= (400-width)))
      moveX = -moveX;
    
    if((y <= 0) || (y >= (400-height)))
      moveY = -moveY;
    
    if(width > 15) {
      y += moveY;
    } else {
      x += moveX;
    }
  }
  
  public void showIndex(Graphics g, int index){
    g.setColor(Color.black);
    g.drawString("" + index, x, y-1);
  }
  
}