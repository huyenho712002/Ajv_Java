
import java.util.concurrent.ArrayBlockingQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class Prime extends Thread {

    static ArrayBlockingQueue<Integer> primeList;
    int start, end;
    public int count = 0;

    public Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int n = start; n <= end; n++) {
            boolean prime = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime && n != 1 && n != 0) {
                count++;
                primeList.add(n);
            }
        }
    }

    public static void main(String[] args) {
        int num = 30000;
        int[] primes = new int[num];

        int nThread = 2;
        final Prime[] pThread = new Prime[nThread];
        Prime.primeList = new ArrayBlockingQueue<>(primes.length);
        int step = primes.length / nThread + 1;
        for (int i = 0; i < nThread; i++) {
            pThread[i] = new Prime(i * step, Math.min(primes.length, (i + 1) * step - 1));
            pThread[i].start();
        }
        try {
            for (int i = 0; i < nThread; i++) {
                pThread[i].join();
            }
        } catch (Exception e) {
        }
        System.out.println("So luong cac so nguyen to tu 1 den 3000");
        for (int i = 0; i < nThread; i++) {
            System.out.println("Thread " + i + "Start: " + pThread[i].start + "End: " + pThread[i].end
                    + "Print Count : " + pThread[i].count);

        }
        System.out.println("Total prime : " + Prime.primeList.size());
        System.out.println(Prime.primeList);
    }
}
