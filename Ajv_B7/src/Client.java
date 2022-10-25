
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
    MulticastSocket client;
    DatagramPacket sendPacket, receivePacket;
    byte[] send, receive;
    
    public Client(){
        
        try{
            client = new MulticastSocket(3333);
            client.joinGroup(InetAddress.getByName("127.0.0.1"));
        }catch(IOException e){
            
        }
        send = new byte[1024];
        receive = new byte[1024];
    }
    public void Start(){
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        a = sc.nextLine();
        System.out.println("b = ");
        b = sc.nextLine();
        try {
            sendPacket = new DatagramPacket(a.getBytes(), a.getBytes().length,
                     InetAddress.getByName("localhost"), 1111);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(b.getBytes(), b.getBytes().length,
                     InetAddress.getByName("localhost"), 1111);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(a.getBytes(), a.getBytes().length,
                     InetAddress.getByName("localhost"), 2222);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(b.getBytes(), b.getBytes().length,
                     InetAddress.getByName("localhost"), 2222);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(a.getBytes(), a.getBytes().length,
                     InetAddress.getByName("localhost"), 4444);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(b.getBytes(), b.getBytes().length,
                     InetAddress.getByName("localhost"), 4444);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(a.getBytes(), a.getBytes().length,
                     InetAddress.getByName("localhost"), 3333);
            client.send(sendPacket);
            sendPacket = new DatagramPacket(b.getBytes(), b.getBytes().length,
                     InetAddress.getByName("localhost"), 5555);
            client.send(sendPacket);
        } catch (UnknownHostException e) {
            System.out.println("Khong tim thay server");
        } catch (IOException e) {
        }
     while (true) {
            try {
                //Nhan
                receivePacket = new DatagramPacket(receive, receive.length);
                client.receive(receivePacket);
                System.out.println(new String(receivePacket.getData(), 
                        0, receivePacket.getLength()));
                client.leaveGroup(InetAddress.getByName("127.0.0.1"));
            } catch (UnknownHostException e) {
                System.out.println("Khong tim thay server");
            } catch (IOException e) {
            }
        }
    }    
	public static void main(String[] args){		
		new Client().Start();
	}
}
