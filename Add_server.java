/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp.multiSolve;

import java.io.*;
import java.net.*;

public class Add_server {
	
	DatagramSocket server;
	DatagramPacket sendPacket,receivePacket;
	byte[] send,receive;

	public Add_server() {
		
		try {
			server = new DatagramSocket(1111);
			System.out.println("Server Cong dang hoat dong");
		} catch (SocketException e) {
			System.out.println("Server Cong khong the hoat dong");
		}
		
		send = new byte[1024];
		receive = new byte[1024];		
	}
	
	public void Start(){
		while(true){
			String a1,b1;
			float a,b;
			receivePacket = new DatagramPacket(receive, receive.length);
			try {
				server.receive(receivePacket);
				a1 = new String (receivePacket.getData(),0,receivePacket.getLength());
				server.receive(receivePacket);
				b1 = new String (receivePacket.getData(),0,receivePacket.getLength());
				System.out.println("Server dang xu ly...");
                                try{
					a = Float.parseFloat(a1);
					b = Float.parseFloat(b1);
					send = ("Server add: " + String.valueOf(Add(a,b))).getBytes();
					sendPacket = new DatagramPacket(send,send.length,InetAddress.getByName("127.0.0.1"),3333);					
				}catch(NumberFormatException  e1){
					send = "Server add: Du lieu khong hop le".getBytes();
					sendPacket = new DatagramPacket(send,send.length,InetAddress.getByName("127.0.0.1"),3333);					
				}	
				server.send(sendPacket);
                                System.out.println("Server da xu ly thanh cong.");
			} catch (IOException e) {			
			}
		}
		
	}
	
	public float Add(float a,float b){
		return (a+b);
		
}	
	public static void main(String[] args) {		
		new Add_server().Start();
	}

}
