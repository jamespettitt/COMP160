import java.text.DecimalFormat;
/**  
 * TriangleApp.java
 * Lab 8, COMP160 2018
 */
public class TriangleApp {
   
   public static void main(String[]args){
      DecimalFormat df = new DecimalFormat("0.0000");
      
      //p1x, p1y, p2x, p2y, p3x, p3y, String nameIn
      Triangle tri1 = new Triangle(0,3,3,4,1,9,"A");
      Triangle tri2 = new Triangle(4,2,6,7,9,4,"B");
      Triangle mytri = new Triangle(7,7,7,10,10,10,"James");
      Triangle test = new Triangle(0,0,3,0,3,4,"right-angled");
      
      System.out.println( "Triangle " + tri1.getName() + " has a perimeter of " + df.format(tri1.getPerimeter()) + " units.");
      System.out.println( "Triangle " + tri2.getName() + " has a perimeter of " + df.format(tri2.getPerimeter()) + " units.");
      System.out.println( "Triangle " + mytri.getName() + " has a perimeter of " + df.format(mytri.getPerimeter()) + " units.");
      System.out.println( "Triangle " + test.getName() + " has a perimeter of " + df.format(test.getPerimeter()) + " units.");

      
   }
   
}//end class
