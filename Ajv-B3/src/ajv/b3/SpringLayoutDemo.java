/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajv.b3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class SpringLayoutDemo extends JFrame{
   public SpringLayoutDemo(){
       setSize(500, 500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SpringLayout layout = new SpringLayout();
       setLayout(layout);
       
       JButton bt1 = new JButton("button 1");
       JButton bt2 = new JButton("button 2");
       
       add(bt1);
       add(bt2);
       
       layout.putConstraint(SpringLayout.WEST, bt1, 10, SpringLayout.WEST, this);
       layout.putConstraint(SpringLayout.NORTH, bt1, 30, SpringLayout.NORTH, this);
       
       layout.putConstraint(SpringLayout.WEST, bt2, 100, SpringLayout.WEST, this);
       layout.putConstraint(SpringLayout.WEST, bt2, 100, SpringLayout.WEST, this);
   } 
    public static void main(String[] args) {
        new SpringLayoutDemo().setVisible(true);
    }
}
