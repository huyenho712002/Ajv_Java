
import java.awt.Frame;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.management.StringValueExp;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Mouse_Listener extends Frame implements MouseListener{
    
    JButton bt = new JButton("Enter");
    JTextField tf = new JTextField("",20);
    int x, y ;
    public Mouse_Listener(){
         super("Mouse Listener");
         x = 0;
         y = 0;
         setLayout(new FlowLayout());
         add(bt);
         add(tf);
         setVisible(true);
         setBounds(100, 100, 400, 400);
         //lắng nghe event
         addMouseListener(this);
         bt.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 tf.setText("");
             }
         });
    }
            
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== bt){
            tf.setText("");
        }
        x = e.getX();
        y = e.getY();
        tf.setText("Mouse Click " + String.valueOf(x)+""+String.valueOf(y));
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        tf.setText("Mouse Click " + String.valueOf(x)+""+String.valueOf(y));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        tf.setText("Mouse Click " + String.valueOf(x)+""+String.valueOf(y));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        tf.setText("Mouse Click " + String.valueOf(x)+""+String.valueOf(y));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        tf.setText("Mouse Click " + String.valueOf(x)+""+String.valueOf(y));
    }
    
    public static void main(String[] args) {
        Mouse_Listener mouse = new Mouse_Listener();
        
        mouse.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
        }
});
    }
}
