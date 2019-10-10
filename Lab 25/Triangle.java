import java.lang.Math;
import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**  
 * Triangle.java
 * Lab 8, COMP160 2018
 */
public class Triangle {
   //data field declarations 
   private int p1x, p1y, p2x, p2y, p3x, p3y, n;  
   private Color colour;
   private Polygon p;
   
   public Triangle() {
      this.p1x = randomRange(3,997);
      this.p1y = randomRange(3,997);
      while((p2x < 1) || (p2x > 1000) || ((p2y < 1) || (p2y > 1000))) {
         this.p2x = randomRange(p1x-300,p1x+300);
         this.p2y = randomRange(p1y-300,p1y+300);
      }
      while((p3x < 1) || (p3x > 1000) || ((p3y < 1) || (p3y > 1000))) {
         this.p3x = randomRange(p1x-300,p1x+300);
         this.p3y = randomRange(p1y-300,p1y+300);
      }
      this.colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
      
      int[] xValues = new int[3];
      xValues[0] = p1x;
      xValues[1] = p2x;
      xValues[2] = p3x;
      
      int[] yValues = new int[3];
      yValues[0] = p1y;
      yValues[1] = p2y;
      yValues[2] = p3y;
      
      n = 3;
      
      p = new Polygon(xValues, yValues, n);
   }
   
   public void display (Graphics g) {
      g.setColor(colour);
      g.fillPolygon(p);
   }
   
   public int randomRange( int lo, int hi ){
      Random generator = new Random();
      return generator.nextInt(hi-(lo+1)) + lo;
   }

   
}//end class
   /*
   public void showIndex(Graphics g, int index, int[] xValues, int[] yValues, Polygon p){
      g.setColor(Color.black);
      g.drawString("" + index, xValues[0], yValues[0]-1);
   }*/
   
   /*
   public double calcSide(int x1, int y1, int x2, int y2) {
      double length = Math.sqrt(    Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)      );
      return length;
   }

   public double getPerimeter() {
      double length1 = calcSide(p1x, p1y, p2x, p2y);
      double length2 = calcSide(p1x, p1y, p3x, p3y);
      double length3 = calcSide(p2x, p2y, p3x, p3y);
      double perimeter = length1 + length2 + length3;
      return perimeter;
   }*/
 
 

