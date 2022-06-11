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
public class EMoney {
    int currentMoney = 20000;
    
    public synchronized void witdraw(int money) {
        System.out.println("Ban dang rut so tien là: " + money);
        check(money);
        if (currentMoney > money) {
            currentMoney = currentMoney - money;
            // currentMoney -= money
            System.out.println("Ban da rut tien thanh cong, so tien con lai là" + currentMoney);
        } else {
            check(money);
        }
       
    }
    
    public void check(int money) {
         if (currentMoney < money) {
            System.out.println("Bot si di, nap tien vao");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(EMoney.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public synchronized void deposit(int money) {
        System.out.println("Ban dang nap tien: " + money);
        currentMoney = currentMoney + money;
        // currentMoney += money;
        System.out.println("So tien hien tai cua ban la: " + currentMoney);
        notify();
    }
}
