/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        int index = 1;
        for(int i =0; i<10; i++){
            System.out.println(this.getName() + ": Softech Aptech "+ index++);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("==>" + this.getName() + "Stopped");
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
