import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo  implements ChangeListener{
    
JFrame frame;
JPanel panel;
JLabel label;
JSlider slider;
SliderDemo(){

    frame = new JFrame();
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0,100,50);

    slider.setPreferredSize( new Dimension(400,200));
    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);

    panel.add(label);
    panel.add(label);
    frame.add(panel, null);
    frame.setSize(420, 420);
    frame.setVisible(true);
}








@Override
public void stateChanged(ChangeEvent e){

}

}
