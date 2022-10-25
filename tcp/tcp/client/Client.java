/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Client {

    public static void main(String[] args) {
        try {
            // tao socket de ket noi toi server
            Socket client = new Socket("localhost", 12345);

            // tao luong du lieu tu Server gui toi
            DataInputStream inFromServer = new DataInputStream(client.getInputStream());
            
            // tao luong du lieu gui toi server
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            
            // Input 2 numbers
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a = ");
            int a = scanner.nextInt();
            
            System.out.print("Input b = ");
            int b = scanner.nextInt();
            
            outToServer.writeUTF(a + "");
            outToServer.writeUTF(b + "");
            
            // nhan ket qua tu server
            String result = inFromServer.readUTF();
            System.out.println("Result = " + result);
            
            // dong ket noi
            client.close();
        } catch (UnknownHostException ex) {
            System.out.println("Server Not Found");
        } catch (IOException ex) {
            System.out.println("Cannot make a connection");
        }
    }
}
