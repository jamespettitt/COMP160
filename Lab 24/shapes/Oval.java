package shapes;

import java.awt.*;

/** sets the colour and draws the shape*/
public class Oval extends Shape {
  public Oval() {
    this.height = (4*width);
    this.y = randomRange(0, (400-height));
  }
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}