import java.awt.*;
import java.awt.event.*; //added extra
import javax.swing.*;
import java.io.*;
import java.util.*;

/** ShapePanel.java
 * Lab 21, COMP160,  2018
 * 
 * a JPanel which rectangles can drawn on
 */
public class ShapePanel extends JPanel{
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel;
  private DrawingPanel drawPanel;
  
  private Shape[] shapes = new Shape[20];
  private int count = 0;
  
  /* constructor for the ShapePanel
   */
  public ShapePanel() {
    setPreferredSize(new Dimension(700,410));
    setBackground(Color.gray);
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel);
    
    //setLayout(new GridLayout(1,2));
    
    addShape = new JButton("Add Shape");
    controlPanel.add(addShape);
    
    countLabel = new JLabel("Count");
    controlPanel.add(countLabel);
    
    controlPanel.add(showNum);

    DrawingPanel drawingPanel = new DrawingPanel();    //makes an instance of the ButtonListener class
    add(drawingPanel);   //adds the lightpanel to the trafficlightpanel (the frame)
    
    ButtonListener listener = new ButtonListener();    //makes an instance of the ButtonListener class
    
    //registers the addShape button to the listener object
    addShape.addActionListener(listener);
  }
  
  /*inner private class that have the functionality of a JPanel
   * because of the extension. 
   */
  private class DrawingPanel extends JPanel {
    //DrawingPanel constructor to set up the panel dimension and colour
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.orange);
    }
    
    /* this draws the circles
     */
    public void paintComponent (Graphics g){
      super.paintComponent(g); 
      
      if ( count > 0 ) {
        for(int i = 0; i < count; i++) {
          shapes[i].display(g); 
        }
      }
    }
  }//DrawingPanel class
  
  /** represents a listener for button presses */
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if ( (count < shapes.length) && (e.getSource() == addShape) ) {
          shapes[count] = new Shape();
          count++; 
          showNum.setText("" + count);
          //System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
      }
      repaint(); //refreshes the panel 
    }//actionPerformed
    
  }//buttonlistener class
  
}//shapepanel