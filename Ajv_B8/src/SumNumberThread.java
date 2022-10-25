
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class SumNumberThread extends Thread {
    int n;

    public SumNumberThread(int n ) {
        this.n = n;
    }
    
    @Override
    public void run() {
        
        int sum = 0;
        for(int i =1; i<n; i++){
            sum += i;
            
            System.out.println("Sum :  " + sum);
        }
       
    }
    public static void main(String[] args) {
           int n ;
 
           Scanner sc = new Scanner(System.in);
           while(true){
               try{
                   n = Integer.parseInt(sc.nextLine());
               }catch(Exception e){
                   System.out.println("Chi duoc nhap so ");
               }
           }
           SumNumberThread sumNumberThread = new SumNumberThread(n);
           sumNumberThread.start();

    }
    
}
