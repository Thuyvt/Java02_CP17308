/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THUYVU
 */
public class MainThread {
    public static void main(String[] args) {
        CounterThread thread1 = new CounterThread();
        CounterThread thread2 = new CounterThread();
        CounterThread thread3 = new CounterThread();
       

        // C1: SET DO UU TIEN CHO TUNG LUONG
//        thread1.setPriority(Thread.NORM_PRIORITY);
//        thread2.setPriority(Thread.MAX_PRIORITY);
        
        // C2: SU DUNG PHUONG THUC JOIN
        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("COMPLETED!!!");
        
        
//        Thread t1 = Thread.currentThread();
//        System.out.println("ID: " + t1.getId());
//        System.out.println("Tên: " + t1.getName());
//        System.out.println("Ðo uu tien: " + t1.getPriority());
//        System.out.println("Trang thai: " + t1.getState());
//        System.out.println("Ðang hoat dong khong: " + t1.isAlive());
//        System.out.println("So luong thread" + Thread.activeCount());
//        System.out.println("Thread completed");
        
        
    }
}
