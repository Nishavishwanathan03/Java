import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame4 extends JFrame {
    JLabel label;

MyFrame4(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setOpaque(true);        this.setVisible(true);
    this.setSize(500,500);
    this.add(label);
    this.setVisible(true);

}
}
