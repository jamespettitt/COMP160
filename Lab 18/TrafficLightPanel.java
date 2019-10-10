import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * TrafficLightPanel.java 
 * James Pettitt 2018
 * Lab 18
 */

public class TrafficLightPanel extends JPanel{
  //setting up the data fields
  JButton redButton;
  JButton amberButton;
  JButton greenButton;
  JLabel lastPressedLabel;
  JPanel buttonPanel = new JPanel();
  
  /** constructor method, sets up the Traffic panel */
  public TrafficLightPanel(){
    //
    redButton = new JButton("Red");
    amberButton = new JButton("Amber");
    greenButton = new JButton("Green");
    lastPressedLabel = new JLabel("last pressed");
    
    setPreferredSize(new Dimension(200,300));
    setBackground(Color.blue);
    
    buttonPanel.setPreferredSize(new Dimension(80,290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    //buttonPanel.add(lastPressedLabel);
    
    add(buttonPanel);    //adds the button panel onto the trafficlightpanel (the frame)
    
    ButtonListener listener = new ButtonListener();    //makes an instance of the ButtonListener class
    
    //registers each button to the listener object
    redButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    greenButton.addActionListener(listener);
    
    LightPanel lightPanel = new LightPanel();    //makes an instance of the ButtonListener class
    add(lightPanel);   //adds the lightpanel to the trafficlightpanel (the frame)
  }//constructor
  
  /** represents a listener for button presses */
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == redButton) {
        lastPressedLabel.setText("red");
        buttonPanel.setBackground(Color.red);
      } else if (e.getSource() == amberButton) {
        lastPressedLabel.setText("amber");
        buttonPanel.setBackground(Color.orange);
      } else if (e.getSource() == greenButton) {
        lastPressedLabel.setText("green");
        buttonPanel.setBackground(Color.green);
      }
      repaint(); //refreshes the panel 
    }//actionPerformed 
  }//button listener class
  
  /*inner private class that have the functionality of a JPanel
   * because of the extension. 
   */
  private class LightPanel extends JPanel {
    //LightPanel constructor to set up the panel dimension and colour
    public LightPanel(){
      setPreferredSize(new Dimension(80,290));
      setBackground(Color.cyan);
    }
 
    /* this draws 3 traffic lights and re-colours them
     * depending on the button pressed
     */
    public void paintComponent (Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      
      g.fillOval(20,30,40,40);
      g.fillOval(20,95,40,40);
      g.fillOval(20,160,40,40);
      
      if(lastPressedLabel.getText().equals("red")){
        g.setColor(Color.red);
        g.fillOval(20,30,40,40);
      } else if(lastPressedLabel.getText().equals("amber")){
        g.setColor(Color.orange);
        g.fillOval(20,95,40,40);
      } else if(lastPressedLabel.getText().equals("green")){
        g.setColor(Color.green);
        g.fillOval(20,160,40,40);
      }
      
    }//paint component
  }//LightPanel class
  
}//TrafficLightPanelclass




