/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajv.b3;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.View;

/**
 *
 * @author ADMIN
 */
public class BoxLayoutDemo extends JFrame  {
    public BoxLayoutDemo(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel container = new JPanel();
        container.setBorder(BorderFactory.createTitledBorder("Box Layout"));
        
        BoxLayout layout = new BoxLayout(container, BoxLayout.X_AXIS);
       
        container.setLayout(layout);
       
        
        container.add(new JButton("button 1"));
        container.add(new JButton("button 2"));
        container.add(new JButton("button 3"));
        container.add(new JButton("button 4"));
        add(container);
        
    }
    public static void main(String[] args) {
        new BoxLayoutDemo().setVisible(true);
    }
}
