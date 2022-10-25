
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //tao server socket
        ServerSocket server = new ServerSocket(12345);
        
        System.out.println("Server Started");
        //tao 1 socket cho thuc hien ket noi tu client den server
        while(true){
            Socket socket = server.accept();
            new MultiConnection(socket).run();
        }
    }
}
