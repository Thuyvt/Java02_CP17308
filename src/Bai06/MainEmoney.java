/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

/**
 *
 * @author THUYVU
 */
public class MainEmoney {
    public static void main(String[] args) {
        EMoney em = new EMoney();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                // RUT TIEN
                em.witdraw(100000);
            }
        };
        t1.start();
        
        Thread t2 = new Thread() {
            @Override
            public void run() {
                // NAP TIEN
                em.deposit(20000);
            }
        };
        t2.start();
    }
}
