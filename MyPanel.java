import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class MyPanel extends JPanel {
    MyPanel(){

    }
    public void  paint(Graphics g);{
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(10));
        g2D.drawLine(0, 0, 500, 500);
    }

}
