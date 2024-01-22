import javaawt.event.addActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class launchPage {
    JFrame frame = new Jframe();
    JButton buttton = new JButton();
    LaunchPage(){
myButton.setBounds(100,160,200,40);
myButton.setFocusable(false);
myButton.addActionListener(this);

frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setlayout(null);
        frame.setSize(420,420);
    }
    
}
