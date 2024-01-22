
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame5 extends JFrame {
MyPanel  panel;


    MyFrame5(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
    
}

public void paint(Graphics g){
Graphics2D g2D = (Graphics2D) g;
g2D.drawLine(0, 0, 500, 500);

}
}
