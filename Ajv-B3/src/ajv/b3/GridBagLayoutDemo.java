/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajv.b3;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {

    Container container;
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7;

    public GridBagLayoutDemo() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = new Container();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        bt1 = new JButton("1");
        container.add(bt1, gbc);

        //button 2
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        bt2 = new JButton("2");
        container.add(bt2, gbc);

        //button 3
        gbc.gridx = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        bt3 = new JButton("3");
        container.add(bt3, gbc);

        //button 4
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;


        bt4 = new JButton("4");
        container.add(bt4, gbc);

        // button 5
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        bt5 = new JButton("5");
        container.add(bt5, gbc);

        //button 6
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        bt6 = new JButton("6");
        container.add(bt6, gbc);

        // button 7
        gbc.gridx = 2;
        bt7 = new JButton("7");
        container.add(bt7, gbc);
        
        add(container);
      
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo().setVisible(true);
    }
}
