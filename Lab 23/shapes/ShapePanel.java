package shapes;

import java.awt.*;
import java.awt.event.*; //added extra
import javax.swing.*;
import java.io.*;
import java.util.*;

/** ShapePanel.java
  * Lab 21, COMP160,  2018
  * 
  * a JPanel which 
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
  
  private JButton[] buttons = new JButton[7];
  
  public ShapePanel() {
    setPreferredSize(new Dimension(700,410));
    setBackground(Color.gray);
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel);
    
    //setLayout(new GridLayout(1,2));
    
    countLabel = new JLabel("Count");
    controlPanel.add(countLabel);

    controlPanel.add(showNum);
    
    DrawingPanel drawingPanel = new DrawingPanel();    //makes an instance of the ButtonListener class
    add(drawingPanel);   //adds the lightpanel to the trafficlightpanel (the frame)
    
    ButtonListener listener = new ButtonListener();    //makes an instance of the ButtonListener class
    
    timer = new javax.swing.Timer(DELAY, listener);
    
    buttons[0] = new JButton("Circle");
    buttons[1] = new JButton("Square");
    buttons[2] = new JButton("Oval");
    buttons[3] = new JButton("Smiley");
    buttons[4] = new JButton("Swirl");
    buttons[5] = new JButton("Start");
    buttons[6] = new JButton("Stop");
    for (JButton button : buttons) {
      button.addActionListener(listener);
      controlPanel.add(button);
    }
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
      } else {
        
        JButton button = (JButton) e.getSource();
        
        if ((button.getText().equals("Circle")) && ((count+1) <= 20)){
          shapes[count] = new Circle();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        } else if ((button.getText().equals("Square")) && (count < shapes.length)){
          shapes[count] = new Square();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        } else if ((button.getText().equals("Oval")) && (count < shapes.length)){
          shapes[count] = new Oval();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        } else if ((button.getText().equals("Smiley")) && (count < shapes.length)){
          shapes[count] = new Smiley();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        } else if ((button.getText().equals("Swirl")) && (count < shapes.length)){
          shapes[count] = new Swirl();
          count++; 
          showNum.setText("" + count);
          System.out.println("Shape count: " + count + " - Reference at shapes[" + (count-1) + "] of new Shape: " + shapes[count-1]);         
        } 
         
        if(button.getText().equals("Start")) {
          timer.start();
          System.out.println("start");
        } else if (button.getText().equals("Stop")) {
          timer.stop();
          System.out.println("stop");
        }
      }
      repaint(); //refreshes the panel 
    }//actionPerformed
    
  }//buttonlistener class
  
}//shapepanel