/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.simpleconnection_addnumber_multithread_gui;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class SumFromServer {
    ServerSocket server;
    Socket conectionSocket;
    
    public SumFromServer() {
        try {
            server = new ServerSocket(12345);
            
            while(true) {
                System.out.println("Server started");
                conectionSocket = server.accept();
                new MultiConnection(conectionSocket).start();
                System.out.println(conectionSocket.getInetAddress().getHostAddress() 
                        + " has just contected");
            }
        }catch(IOException ex) {
            System.out.println("Server can not start");
        }
    }
    
    public static void main(String[] args) {
        new SumFromServer();
    }
}
