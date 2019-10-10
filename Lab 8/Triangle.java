import java.lang.Math;
import java.text.DecimalFormat;

/**  
 * Triangle.java
 * Lab 8, COMP160 2018
 */
public class Triangle {
   //data field declarations 
   private int p1x;        
   private int p1y;          
   private int p2x;         
   private int p2y;
   private int p3x;
   private int p3y;
   private String name; // triangle name 
   

   
   public Triangle() {
      
   }
   
   public Triangle(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, String nameIn) {
      this.p1x = p1x;
      this.p1y = p1y;
      this.p2x = p2x;
      this.p2y = p2y;
      this.p3x = p3x;
      this.p3y = p3y;
      name = nameIn;
      
   }
   
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
   }

   
   public String getName() {

      String s = name;
      return s;
   }
   
   
   
 
}//end class
