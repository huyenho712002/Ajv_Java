/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.simpleconnection_addnumber_multithread_gui;

import tcp.server.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class MultiConnection extends Thread {

    Socket socket = null;

    public MultiConnection(Socket client) {
        this.socket = client;
    }

    public void run() {
        try {
            // Tao luong nhan du lieu tu client
            DataInputStream inFromClient = new DataInputStream(socket.getInputStream());

            // Tao luong gui du lieu toi client
            DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());

            // Lay du lieu tu Client gui len: so 1 và so 2
            int so1 = Integer.parseInt(inFromClient.readUTF());
            int so2 = Integer.parseInt(inFromClient.readUTF());

            System.out.println(socket.getInetAddress().getHostAddress() + " connected to server");
            System.out.println("Data from client " + so1 + ", " + so2);

            int result = add(so1, so2);

            // Gui ket qua cho Client
            outToClient.writeUTF(String.valueOf(result));
        } catch (Exception ex) {
            System.out.println("Can not receiver data");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
