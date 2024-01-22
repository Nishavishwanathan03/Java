
 import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
public class Main7 {

    private static final String BorderLaoyout = null;
    private static final JPanel Panel2 = null;

    public static void main(String[] args){  

        JFrame  frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(BorderLaoyout);
        frame.setSize(500,500);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        panel1.setBackground( Color.red);
        panel2.setBackground( Color.blue);

        panel3.setBackground( Color.yellow);
        panel4.setBackground( Color.pink);
        panel5.setBackground( Color.white);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

         frame.add(panel1,BorderLaoyout);
         frame.add(Panel2,BorderLaoyout);
        




    }


}
