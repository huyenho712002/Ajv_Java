/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.simpleconnection_addnumber_multithread_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class ClientData extends JFrame implements ActionListener {

    JTextField txtSoA, txtSoB, txtResult;
    JButton btTinh;

    Socket clientSocket;

    // Tao luong du lieu tu server gui ve
    DataInputStream inFromServer;

    // tao luong du lieu gui toi server
    DataOutputStream outToServer;

    public ClientData() {
        txtSoA = new JTextField(10);
        txtSoB = new JTextField(10);
        txtResult = new JTextField(10);

        btTinh = new JButton("Tinh tong");
        btTinh.addActionListener(this);
        txtResult.enable(false);

        setLayout(new FlowLayout());
        add(new JLabel("So a"));
        add(txtSoA);
        add(new JLabel("So b"));
        add(txtSoB);
        add(btTinh);
        add(new JLabel("Ket qua"));
        add(txtResult);
        pack();

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btTinh) {

            try {
                clientSocket = new Socket("localhost", 12345);
                inFromServer = new DataInputStream(clientSocket.getInputStream());
                outToServer = new DataOutputStream(clientSocket.getOutputStream());

                // Send data
                outToServer.writeUTF(txtSoA.getText());
                outToServer.writeUTF(txtSoB.getText());

                // nhan ket qua tu server
                String result = inFromServer.readUTF();
                txtResult.setText(result);
            } catch (IOException e) {
                System.out.println("Can not connect");
            }
        }
    }

    public static void main(String[] args) {
        new ClientData();
    }
}
