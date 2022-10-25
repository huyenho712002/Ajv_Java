/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyRunable implements Runnable{

    @Override
    public void run() {
        int index = 1;
        for(int i =0; i<10; i++){
            System.out.println(": Softech Aptech "+ index++);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("==>" + "Stopped");
    }
    public static void main(String[] args) {
        MyRunable myRunnable = new MyRunable() ;
        MyRunable myRunnable1 = new MyRunable() ;
        MyRunable myRunnable2 = new MyRunable() ;
        Thread t = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);
        
        t.start();
        t1.start();
        t2.start();
        
    }
}
