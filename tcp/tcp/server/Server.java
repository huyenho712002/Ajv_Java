/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.server;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Server {

    public static void main(String[] args) throws IOException {

        // Tao server socket
        ServerSocket server = new ServerSocket(12345);

        System.out.println("Server started");

        // Tao 1 socket cho thuc hien ket noi tu client den server
        while (true) {
            Socket socket = server.accept();
            new MultiConnection(socket).run();
        }
    }

}
