import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame  frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    ProgressBarDemo(){
bar.setValue(0);
bar.setBounds(0,0,420,420);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(420, 420);
    frame.setVisible(true);
    }


    }

