
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.channels.DatagramChannel;

class MultiConnection {
    Socket socket = null;
    public MultiConnection(Socket client) {
        this.socket = client;
    }
    public void run(){
        try{
            //tao luong nhan du lieu tu client
            DataInputStream inFromClient = new DataInputStream(socket.getInputStream());
            
            //tao luong gui du lieu toi client
            DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
            
            //Lay data tu Client gui len Server
            int so1 = Integer.parseInt(inFromClient.readUTF());
            int so2 = Integer.parseInt(inFromClient.readUTF());
            
            System.out.println(socket.getInetAddress().getHostAddress()+ "connected to server");
            System.out.println("Data from Client "+ so1 +","+ so2);
            int result = so1 + so2;
            
            //gui result cho Client
            outToClient.writeUTF(String.valueOf(result));
        }catch(Exception e){
            System.out.println("Can not receive data");   
        }
    }
   
}
