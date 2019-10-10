import javax.swing.*;
/**
 * TrafficLightApp.java 
 * James Pettitt 2018
 * Lab 18
 */

public class TrafficLightApp{
  /** creates  an instance of the TrafficLightPanel class, puts it on a frame and sets some essential parameters.*/
  public static void main(String[]args){
    JFrame frame = new JFrame("TrafficLight"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TrafficLightPanel trafficlight1 = new TrafficLightPanel();
    frame.getContentPane().add (trafficlight1);
    frame.pack();
    frame.setVisible(true);
  }
}