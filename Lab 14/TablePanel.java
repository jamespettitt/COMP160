import javax.swing.*;
import java.awt.*;
/**
 * TablePanel.Java
 * Comp160
 * James Pettitt 2018
 */
public class TablePanel extends JPanel {
   //declares 6 data fields to hold reference to 6 Diner objects
      public Diner diner1;
      public Diner diner2;
      public Diner diner3;
      public Diner diner4;
      public Diner diner5;
      public Diner diner6;

   /*
    * constructor to create Diners and sets the values appropriate
    */
   public TablePanel() {
      //creates 6 Diner objects and sends appropriate values for each diner
      diner1 = new Diner(175, 65, "Caleb", 1, Color.blue);
      diner2 = new Diner(240, 140, "Georgia", 2, Color.pink);
      diner3 = new Diner(240, 210, "Maala", 3, Color.blue);
      diner4 = new Diner(175, 290, "Bic", 4, Color.pink);
      diner5 = new Diner(105, 210, "Kings", 5, Color.blue);
      diner6 = new Diner(105, 140, "Lorde", 6, Color.pink);
   
      //sets the size and background of the panel
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.lightGray);
   }
   
   public void paintComponent( Graphics g ){
      //draws a panel the size and colour of th background of the inherited JPanel
      super.paintComponent(g);
    
      //calls the draw method of each Diner object, passing the Graphics object
      diner1.draw(g);
      diner2.draw(g);
      diner3.draw(g);
      diner4.draw(g);
      diner5.draw(g);
      diner6.draw(g);
      
      //draws the dinner table
      g.fillRect (170, 125, 60, 150);
   }
}