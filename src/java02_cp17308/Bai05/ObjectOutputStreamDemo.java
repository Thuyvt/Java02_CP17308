/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17308.Bai05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THUYVU
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/ObjectOutputStreamDemo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            Student[] students = {  new Student("Thuy", 8.6, "UDPM"), 
//                                    new Student("Luong", 6.5, "WEB"),
//                                    new Student("Loan", 7.0, "KT")};
//            List<Student> listStudent = Arrays.asList(students);

            List<Student> listStudent = new ArrayList<>();
            listStudent.add(new Student("Thuy", 10, "ak"));
            listStudent.add(new Student("Luong", 8, "UD"));
            listStudent.add(new Student("Duy", 7.5, "WEB"));
            listStudent.add(new Student("Loan", 6, "KT"));

            // GHI MANG STUDENT VAO FILE
            oos.writeObject(listStudent);
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
