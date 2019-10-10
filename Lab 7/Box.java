/**  
 * Box.java
 * Lab 7, COMP160 2018
 */
public class Box {
   //data field declarations 
   private int height;         // box height 
   private int width;          // box width 
   private int length;         // box length 
   private static String name; // owner name 
   
   public Box(int h, int w, int l) {
      height = h;
      width = w;
      length = l;
   }
   
   public Box() {
      height = 0;
      width = 0;
      length = 0;
   }
   
   public Box(int side) {
      height = side;
      width = side;
      length = side;
   }
   
   /**sets the value of the data field height to input parameter value
   *@param h the height*/
   public void setHeight(int h) {
      this.height = h;
   }
   
   /**sets the value of the data field width to input parameter value
   *@param w the width*/
   public void setWidth(int w) {
      this.width = w;
   }
   
   /**sets the value of the data field length to input parameter value
   *@param l the length*/
   public void setLength(int l) {
      this.length = l;
   }
   
   /**calculate the value of volume
  *@return the volume of the box */
   public int getVolume() {
      int volume = height * width * length;
      return volume;
   }
   
   /**returns the value of sArea
  *@return the surface area of the box */
   public int getSurfaceArea() {
      int side1 = height * length;
      int side2 = length * width;
      int side3 = height * width;
      
      int sArea = (side1 + side2 + side3) * 2;
      
      return sArea;
   }
   
   /**returns the value of s
  *@return information about the box */
   public String toString() {
      String s = String.format("Height: %d, Length: %d, Width: %d, Volume: %d, Surface Area: %d, Owned by: %s", height, length, width, getVolume(), getSurfaceArea(), name);
      return s;
   }
   
   /**sets the value of the data field name to input parameter value
   *@param n the name*/
   public static void setName(String n) {
      name = n;
   }
   
   
   
}//end class
