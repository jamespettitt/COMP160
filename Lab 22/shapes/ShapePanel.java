package shapes;

import java.awt.*;
import java.awt.event.*; //added extra
import javax.swing.*;
import java.io.*;
import java.util.*;

/** ShapePanel.java
  * Lab 22, COMP160,  2018
  * 
  * a JPanel which shapes are drawn on and moved if the button is clicked
  */
public class ShapePanel extends JPanel{
  private JPanel controlPanel;
  private JButton addShape, startButton, stopButton;
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel;
  private DrawingPanel drawPanel;
  
  javax.swing.Timer timer;
  private final int DELAY = 10;
  
  private Shape[] shapes = new Shape[20];
  private int count = 0;
  
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
    
    startButton = new JButton("Start");
    startButton.addActionListener(listener);
    controlPanel.add(startButton);
    
    stopButton = new JButton("Stop");
    stopButton.addActionListener(listener);
    controlPanel.add(stopButton);
    
    timer = new javax.swing.Timer(DELAY, listener);
    
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
      if(e.getSource() == timer) {
         for( int i = 0; i < count; i++) {
            shapes[i].move();
         }
      } else if (count < shapes.length) {
        if (e.getSource() == addShape){
          shapes[count] = new Shape();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        }
      }
      
      if(e.getSource() == startButton) {
        timer.start();
        System.out.println("start");
      } else if (e.getSource() == stopButton) {
        timer.stop();
        System.out.println("stop");
      }
      repaint(); //refreshes the panel 
    }//actionPerformed
    
  }//buttonlistener class
  
}//shapepanel