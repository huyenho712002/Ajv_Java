
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Add_server {
    DatagramSocket server;
    DatagramPacket sendPacket, receivePacket;
    byte[] send, receive;
    
    public Add_server(){
        
        try{
            server = new DatagramSocket(1111);
            System.out.println("Server Cong dang hoat dong");
    }catch(SocketException e){
            System.out.println("Server Cong khong hoat dong");
    }
    send = new byte[1024];
    receive = new byte[1024];
    
    }
    public void Start(){
        while(true){
            String a1, b1;
            float a, b;
            receivePacket = new DatagramPacket(receive, receive.length);
            try{
                server.receive(receivePacket);
                a1 = new String(receivePacket.getData(),0, receivePacket.getLength());
                server.receive(receivePacket);
                b1 = new String(receivePacket.getData(),0,receivePacket.getLength());
                System.out.println("Server dang xu li...");   
                try{
                    a = Float.parseFloat(a1);
                    b = Float.parseFloat(b1);
                    send = ("Server add: " + String.valueOf(a+b)).getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                    
                }catch(NumberFormatException e1){
                    send = ("Server add khong dung").getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                }
               server.send(sendPacket);
                                System.out.println("Server da xu ly thanh cong.");
            } catch (IOException e) {			
		} 
        }
    }
    
    public void Tru(){
       while(true){
            String a1, b1;
            float a, b;
            receivePacket = new DatagramPacket(receive, receive.length);
            try{
                server.receive(receivePacket);
                a1 = new String(receivePacket.getData(),0, receivePacket.getLength());
                server.receive(receivePacket);
                b1 = new String(receivePacket.getData(),0,receivePacket.getLength());
                System.out.println("Server dang xu li...");   
                try{
                    a = Float.parseFloat(a1);
                    b = Float.parseFloat(b1);
                    send = ("Server Tru: " + String.valueOf(a-b)).getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                    
                }catch(NumberFormatException e1){
                    send = ("Server Tru khong dung").getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                }
               server.send(sendPacket);
                                System.out.println("Server da xu ly thanh cong.");
            } catch (IOException e) {			
		} 
        }  
    }
    public void Nhan(){
         while(true){
            String a1, b1;
            float a, b;
            receivePacket = new DatagramPacket(receive, receive.length);
            try{
                server.receive(receivePacket);
                a1 = new String(receivePacket.getData(),0, receivePacket.getLength());
                server.receive(receivePacket);
                b1 = new String(receivePacket.getData(),0,receivePacket.getLength());
                System.out.println("Server dang xu li...");   
                try{
                    a = Float.parseFloat(a1);
                    b = Float.parseFloat(b1);
                    send = ("Server Nhan: " + String.valueOf(a*b)).getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                    
                }catch(NumberFormatException e1){
                    send = ("Server Nhan khong dung").getBytes();
                    sendPacket = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"),3333);
                }
               server.send(sendPacket);
                                System.out.println("Server da xu ly thanh cong.");
            } catch (IOException e) {			
		} 
        }
    }
    
	 public static void main(String[] args) {
        new Add_server().Start();
        new Add_server().Tru();
        new Add_server().Nhan();
    }
   
}
