import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Label;

import java.awt.*;
public class Main8 {
    public static void main(String[] args){
 
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBorder(javax.swing.BorderFactory.createDashedBorder(Color.BLUE));

        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();

        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setBackground(null);

        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);

        JLabel label14 = new JLabel();
        label14.setBackground(null);

        label14.setOpaque(true);
        label14.setBounds(200,200,200,200);

        JLayeredPane layeredPane = new JLayeredPane();

        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label14);
        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);
JFrame frame = new JFrame();
frame.add(layeredPane);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500, 500);
frame.setVisible(true);
frame.setLayout(null);



    }

    private static void setBackground(Color blue) {
    }
}
