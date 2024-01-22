import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame  extends JFrame implements ActionListener{
JMenuBar menuBar;
JMenu filJMenu;
JMenu editJMenu;
JMenu helpJMenu;

JMenuItem loadItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    JMenuBar menuBar = new JMenuBar();
    this.setJMenuBar(menuBar);
    JMenu filMenu = new JMenu("file");
    JMenu editMenu = new JMenu("edit");
    JMenu helpMenu = new JMenu("help");

     loadItem = new JMenuItem("load");
     saveItem = new JMenuItem("save");
    exitItem = new JMenuItem("exit");

    
    filMenu.setMnemonic(KeyEvent.VK_F);
    editMenu.setMnemonic(KeyEvent.VK_E);
    helpMenu.setMnemonic(KeyEvent.VK_H);


    loadItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);
    filMenu.add(loadItem);
    filMenu.add(saveItem);
    filMenu.add(exitItem);


    menuBar.add(filMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);



    this.pack();
    this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==loadItem){
    System.out.println("'beep boop' you loadeed a file");
}

if(e.getSource()==exitItem){
System.exit(0);}
}
}

    
    





