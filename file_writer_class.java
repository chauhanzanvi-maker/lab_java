/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zanvi_fswd;
import java.io.*;
/**
 *
 * @author chauh
 */
public class file_writer_class {
     public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Fswd.txt");

            fw.write("Hello Students How are you...");

            fw.close();

            System.out.println("your file is ready... kindly check...");
            System.out.println(new File("Fswd.txt").getAbsolutePath());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
