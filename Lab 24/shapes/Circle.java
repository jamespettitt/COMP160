package shapes;

import java.awt.*;
/** sets the colour and draws the shape*/
public class Circle extends Shape {
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}