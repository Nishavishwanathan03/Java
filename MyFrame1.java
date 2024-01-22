import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame  extends JFrame implements ActionListener{
    JComboBox comboBox;
MyFrame1(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    String[] animals = {"dog","cat","rat"};
   comboBox = new JComboBox(animals);
   comboBox.addActionListener(comboBox);

    this.add(comboBox);
    
    this.pack();
    this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==comboBox){    
   System.out.println(comboBox.getSelectedItem());
    }

}
}

    
    




}
