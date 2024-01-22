import java.awt.color.*;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MyFrame3 extends JFrame {
    
JLabel  label;

    MyFrame3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.addKeyListener(this);
    this.setVisible(true);

label.setBackground(Color.values("red"));
    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setOpaque(true);
    this.add(label);
    this.setVisible(true);

    }
    private void addKeyListener(MyFrame3 myFrame3) {
    }
    @Override
    public void KeyTyped(KeyEvent e){

    }
    @Override
    public void KeyPressed(KeyEvent e){
        
    }
    @Override
    public void KeyReleased(KeyEvent e){
        System.out.println("YOU RELEASED KEY CHAR" + e.getKeyChar());
    }
}
