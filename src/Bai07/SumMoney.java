/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai07;

/**
 *
 * @author THUYVU
 */
public class SumMoney {
    public static void main(String[] args) {
        // Lay ra mang cac hang so
        ParkingArea[] parkings = ParkingArea.values();
        
        for (ParkingArea pa : parkings) {
            System.out.println(pa);
        }
        
        // Lay ra ten hang so
        ParkingArea pa1 = ParkingArea.valueOf("SUV");
        ParkingArea pa2 = ParkingArea.SEDAN;
        
        System.out.println(pa1);
        System.out.println(pa2);
        
        // Lay ra gia tri hang so
        System.out.println(">> Money pa1: " + pa1.getMoney());
        System.out.println(">> Vi tri hang so: " + pa2.ordinal());
        System.out.println(">> So sanh 2 voi nhau: " + pa1.compareTo(pa2));
        
        // BOXING: CHUYEN DOI TU DU LIEU NGUYEN THUY -> WRAPPER CLASS
        int int1 = 10;
        String str1 = "12";
        Integer integer1 = Integer.parseInt(str1);
        Integer integer2 = Integer.valueOf(int1);
        
        System.out.println(integer1);
        System.out.println(integer2);

        // UNBOXING: WRAPPER CLASS -> DU LIEU NGUYEN THUY
        System.out.println(integer1.intValue());
        System.out.println(integer1.doubleValue());
        
        // Double, Float, Boolean, Long
        
        // AutoBoxing
        Integer integer3 = Integer.valueOf(100);
        int int3 = integer3;
        System.out.println(integer3);
        System.out.println(int3);
        // AutoUnboxing
        integer3++;
        int3++;
        System.out.println(integer3);
        System.out.println(int3);
        
    }
}
