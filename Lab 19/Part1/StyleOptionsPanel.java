//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton courier, times, helvetica;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  {
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    courier = new JRadioButton ("Courier");
    courier.setBackground (Color.cyan);
    
    times = new JRadioButton ("Times New Roman");
    times.setBackground (Color.cyan);
    
    helvetica = new JRadioButton ("Helvetica", true);
    helvetica.setBackground (Color.cyan);
    
    //groups the radio buttons so only 1 can be selected
    ButtonGroup group = new ButtonGroup();
    group.add(courier);
    group.add(times);
    group.add(helvetica);
    
    //adds itemlistener for all the buttons so they are responsive
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    courier.addItemListener (listener);
    times.addItemListener (listener);
    helvetica.addItemListener (listener);
    
    //adds the buttons to the panel
    add (saying);
    add (bold);
    add (italic);
    add (courier);
    add (times);
    add (helvetica);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 100));
    
    //sets the layout with a GridLayout with 6 rows and 1 column
    setLayout(new GridLayout (6, 1));
    
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes and radiobuttons
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      /*
      Font c = new Font("Courier", Font.PLAIN, 18);
      Font tr = new Font("TimesRoman", Font.PLAIN, 18);
      Font h = new Font("Helvetica", Font.PLAIN, 18);*/
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      //changes the font
      if (courier.isSelected()) {
        typeFace = "Courier";
      } else if (times.isSelected()){
        typeFace = "TimesRoman";
      } else if (helvetica.isSelected()){
        typeFace = "Helvetica";
      }
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
}