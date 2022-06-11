/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17308;

/**
 *
 * @author THUYVU
 */
abstract public class Animal {
    protected int legs;
    
    // Constructor
    protected Animal(int legs) {
        this.legs = legs;
    }
    
    abstract public void eat();
    public void walk() {
        System.out.println("Con nay di bo voi " + this.legs);
    }
}
