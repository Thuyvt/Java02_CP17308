/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17308.Bai05;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THUYVU
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/DataOutputStreamDemo.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeUTF("Hello DataOutputStreamDemo");
            dos.writeInt(8);
            dos.writeBoolean(true);
            dos.writeDouble(7.5);
            // DONG KET NOI VOI FILE
            dos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
