package ajv.b3;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        
        JButton bt1 = new JButton("Button 1");
        JButton bt2 = new JButton("Button 2");
        JButton bt3 = new JButton("Button 3");
        
        add(bt1);
        add(bt2);
        add(bt3);
    }
    public static void main(String[] args) {
       new FlowLayoutDemo().setVisible(true);
    }
    
}
