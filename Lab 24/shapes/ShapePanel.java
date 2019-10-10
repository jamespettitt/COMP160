package shapes;

import java.awt.*;
import java.awt.event.*; //added extra
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

/** ShapePanel.java
  * Lab 24, COMP160,  2018
  * 
  * a JPanel which you can draw different types of shapes on and move them 
  */
public class ShapePanel extends JPanel{
  private JPanel controlPanel;
  private JButton addShape, startButton, stopButton;
  private JTextField showNum = new JTextField(2);
  private JLabel removeLabel;
  private DrawingPanel drawPanel;
  
  javax.swing.Timer timer;
  private final int DELAY = 10;
  
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  //private Shape[] shapes = new Shape[20];
  private int removeNum;
  
  private JButton[] buttons = new JButton[8];
  
  public ShapePanel() {
    setPreferredSize(new Dimension(700,410));
    setBackground(Color.gray);
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel);
    
    //setLayout(new GridLayout(1,2));

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
    buttons[7] = new JButton("Remove");
    
    for (JButton button : buttons) {
      button.addActionListener(listener);
      controlPanel.add(button);
    }
    
    /*
    String[] names = {"Circle", "Square", "Oval", "Smiley", "Swirl", "Start", "Stop", "Remove"};
    JButton[] buttons = new JButton[names.length];
    for(int i = 0; i <  names.length; i++) {
       button[i] = new JButton(names[i]);  
    }*/
    
    removeLabel = new JLabel("Remove which?");
    controlPanel.add(removeLabel);
    
    showNum.setText("");
    controlPanel.add(showNum);
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
    
    /* this draws the shapes
     */
    public void paintComponent (Graphics g){
      super.paintComponent(g); 
      
      if ( shapes.size() > 0 ) {
        for(int i = 0; i < shapes.size(); i++) {
          shapes.get(i).display(g);
          shapes.get(i).showIndex(g, i);
        }
      }
      
    }
  }//DrawingPanel class
  
  /** represents a listener for button presses */
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == timer) {
        for( int i = 0; i < shapes.size(); i++) {
            shapes.get(i).move();
         }
      } else {
        
        JButton button = (JButton) e.getSource();
        
        if (button.getText().equals("Circle")){
          //shapes[count] = new Circle();
          shapes.add(new Circle());
          showNum.setText("" + (shapes.size()-1));        
        } else if (button.getText().equals("Square")){
          shapes.add(new Square()); 
          showNum.setText("" + (shapes.size()-1));
        } else if (button.getText().equals("Oval")){
          shapes.add(new Oval());
          showNum.setText("" + (shapes.size()-1));         
        } else if (button.getText().equals("Smiley")){
          shapes.add(new Smiley());
          showNum.setText("" + (shapes.size()-1));         
        } else if (button.getText().equals("Swirl")){
          shapes.add(new Swirl()); 
          showNum.setText("" + (shapes.size()-1));         
        } 
        
        if (button.getText().equals("Remove") && (shapes.size() > 0)) {
          String text = showNum.getText();
          
          try {
            removeNum = Integer.parseInt(text);
            shapes.remove(removeNum);
            if (shapes.size() == 0) {
              showNum.setText("");
            } else if (shapes.size() > 0 ) {
              showNum.setText("" + (shapes.size()-1));
            }
            
          } catch(NumberFormatException ex) {
            showNum.setText(text);
            System.out.println("Enter an integer");
          } catch(IndexOutOfBoundsException ex) {
            showNum.setText(text);
            System.out.println("Enter an integer less than " + shapes.size());
          }
          
        } else if (shapes.size() == 0) {
          showNum.setText("");
        }
        
        
        
        if(button.getText().equals("Start") && (shapes.size() > 0)) {
          timer.start();
          System.out.println("Starting movement");
        } else if (button.getText().equals("Stop") ) {
          timer.stop();
          System.out.println("Stopping movement");
        }
      }
      
      repaint(); //refreshes the panel 
    }//actionPerformed
    
  }//buttonlistener class
  
}//shapepanel