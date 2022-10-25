
package ajv.b3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout layout = new GridLayout(3,1);
        setLayout(layout);
        
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);

    }
    public static void main(String[] args) {
        new GridLayoutDemo().setVisible(true);
    }
}
