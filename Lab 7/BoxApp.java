/**  
 * Box.java
 * Lab 7, COMP160 2018
 */
public class BoxApp {
   
   public static void main(String[]args){
      Box box1 = new Box();
      Box box2 = new Box(3,4,5);
      Box box3 = new Box(5);
      Box box4 = new Box(7);
      
      box1.setHeight(4);
      box1.setWidth(4);
      box1.setLength(6);
      
      Box.setName("Anna Austin");
      
      System.out.println( box1 );
      System.out.println( box2 );
      System.out.println( box3 );
      System.out.println( box4 );
      
      /*
      Box.setName("Bob Berry");
      
      System.out.println( box1 );
      System.out.println( box2 );
      System.out.println( box3 );
      System.out.println( box4 );*/
   }
   
}//end class
