/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17308.Bai05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THUYVU
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        File filename = new File("D:/FileWriterDemo.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("Ðoc ghi du liêu trong java");
            fw.write("\n");
            fw.write("Su dung Stream Character");
            
            fw.close();
            
            // DOC DU LIEU
            FileReader fr = new FileReader(filename);
            System.out.println("Ðoc du liêu tu file");
            int character = fr.read();
            while (character != -1 ) {
                System.out.print((char) character);
                character = fr.read();
            }

//            while (fr.read() != -1) {
//                System.out.print((char) fr.read());
//            }
            fr.close();
            
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
