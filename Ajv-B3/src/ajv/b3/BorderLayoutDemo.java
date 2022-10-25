
package ajv.b3;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        
        JButton bt1 = new JButton("Button 1");
        add(bt1, BorderLayout.NORTH);
        JButton bt2 = new JButton("Button 2");
        add(bt2, BorderLayout.SOUTH);
        JButton bt3 = new JButton("Button 3");
        add(bt3, BorderLayout.WEST);
        JButton bt4 = new JButton("Button 4");
        add(bt4, BorderLayout.EAST);
        JButton bt5 = new JButton("Button 5");
        add(bt5, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo().setVisible(true);
    }
}
