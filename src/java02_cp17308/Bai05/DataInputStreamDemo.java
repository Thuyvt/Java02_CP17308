/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17308.Bai05;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THUYVU
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/DataOutputStreamDemo.txt");
            DataInputStream dis = new DataInputStream(fis);
            
            String name = dis.readUTF();
            int mark = dis.readInt();
            boolean isStudent = dis.readBoolean();
            double finalGrade = dis.readDouble();
            
            System.out.println("name: " + name);
            System.out.println("mark: " + mark);
            System.out.println("isStudent: " + isStudent);
            System.out.println("finalGrade: " + finalGrade);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
