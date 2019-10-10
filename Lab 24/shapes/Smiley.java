package shapes;

import java.awt.*;
/** sets the size and coordinates*/
public class Smiley extends Shape {
  public Smiley() {
    this.width = 30;
    this.height = 30;
    this.x = randomRange(0, (400-width));
    this.y = randomRange(0, (400-height));
  }
  /** sets the colours and draws the shape*/
  public void display (Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x, y, width, height);
    g.fillOval(x+7, y+8, 4, 4);
    g.fillOval(x+20, y+8, 4, 4);
    g.drawArc(x + 8, y + 10, 15, 13, 190, 160);
  }
}

