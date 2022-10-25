
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class ClientofMul {
    
    public static void main(String[] args) throws IOException {
        try{
            //tao socket da ket noi toi server
            Socket client = new Socket("localhost", 12345);
            
            //tao luong du lieu da nhan toi server
            DataInputStream inFromServer = new DataInputStream(client.getInputStream());
            
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
            //input 2 so
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a = ");
            int a = sc.nextInt();
            System.out.print("Input b = ");
            int b = sc.nextInt();
            
            out
        }catch(Exception e){
            
        }
    }
}
