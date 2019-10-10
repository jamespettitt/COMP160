import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

/** FilePanel.java
  * Lab 20, COMP160,  2018
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
   private Rectangle[] drawObjects = new Rectangle [10];
   private int count;
   private String fileName;
   private int fillInt, colourInt, x, y, width, height;
   private boolean fill;
   private Color colour;
   
   /**constructor instantiates 6 Rectangle objects*/
   public FilePanel(){  
      //drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30);
      //count++;
      //drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30);
      //count++;
      
      setPreferredSize(new Dimension(300,300));
      setBackground(Color.yellow);
      //fileName = "Lab20data.txt";
      fileName = "BadData.txt";
      fileName = "LongBadData.txt";
      
      
      try{
         Scanner fileScan = new Scanner(new File( fileName));
         
         
         while(fileScan.hasNextLine() && count < drawObjects.length){
            String inputLine = fileScan.nextLine(); //part1
            if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){ //part2
               Scanner scan = new Scanner(inputLine); //part3
               
               fillInt = scan.nextInt();
               colourInt = scan.nextInt();
               x = scan.nextInt();
               y = scan.nextInt();
               width = scan.nextInt();
               height = scan.nextInt();
               
               if (fillInt == 1) {
                  fill = true;
               } else if (fillInt == 0) {
                  fill = false;
               }
               
               if (colourInt == 1) {
                  colour = Color.red;
               } else if (colourInt == 2) {
                  colour = Color.blue;
               } else if (colourInt == 3) {
                  colour = Color.green;
               }
               
               drawObjects[count] = new Rectangle(fill, colour, x, y, width, height);
               count++;
            }//if
         }//while
         
         
         
      } catch (FileNotFoundException e){ 
         System.out.println("File not found. Check file name and location."); 
         System.exit(1);//exit from program if no file to read
      }//catch
      
   }//constructor
   
   /**each Rectangle will draw itself*/
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0; i < count; i++){
         drawObjects[i].draw(g);
      } 
   }
}