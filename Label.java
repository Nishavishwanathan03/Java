
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Label {
    public static void main(String[] args){

        ImageIcon image =  new ImageIcon("code.png");

        JLabel label = new JLabel();
        label.setText("BRO DO YOU EVEN CODE");
        label.setIcon(image);
        JFrame frame = new JFrame();
        frame.setTitle("JFRAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setVisible(true);
        frame.add(label);
        
            }
}
