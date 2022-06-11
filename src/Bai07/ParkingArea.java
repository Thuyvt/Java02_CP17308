/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Bai07;

/**
 *
 * @author THUYVU
 */
public enum ParkingArea {
    MOTOBIKE(5000), SEDAN(30000), SUV(35000), VAN(40000);
    
    private int money;

    private ParkingArea(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
    
    
    
}
