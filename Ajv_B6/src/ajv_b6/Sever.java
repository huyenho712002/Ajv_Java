/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajv_b6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author ADMIN
 */
public class Sever {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket serverSocket = new DatagramSocket(12345);
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        
        while(true){
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            //Nhan du lieu 1 lan
            serverSocket.receive(receivePacket);
            InetAddress ipAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            byte[] data = receivePacket.getData();
            
            //in toan bo du lieu
            System.out.println("Toan bo thong tin client gui toi");
            System.out.println("Ip Client "+ ipAddress);
            System.out.println("Port "+ port);
            System.out.println("Data "+ new String(data, 0 , data.length));
            
            //gui du lieu lan 2
            sendData = ("Da nhan du lieu ").getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, 0, data.length, ipAddress, port);
            serverSocket.send(sendPacket);
            
            sendData = "next send".getBytes();
            sendPacket = new DatagramPacket(sendData, 0, data.length, ipAddress, port);
            serverSocket.send(sendPacket);
            
        }
    }
}
