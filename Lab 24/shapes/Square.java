package shapes;

import java.awt.*;
/** sets the colour and draws the shape*/
public class Square extends Shape {
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}