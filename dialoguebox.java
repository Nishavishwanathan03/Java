import javax.swing.JOptionPane;

public class dialoguebox {
    public static void main(String[] args){
    String name = JOptionPane.showInputDialog( "What is your name");
    JOptionPane.showMessageDialog(null, "Hello" + name );

    int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
    JOptionPane.showMessageDialog( null,"you are"  + age);
    
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter  your height"));

    JOptionPane.showMessageDialog(null, " you are height is"+ height );

    }
    
}
22w