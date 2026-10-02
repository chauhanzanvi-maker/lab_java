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
public class fileoutput_strem {
    public static void main(String[] args) {
        try {
            // Creates a file output stream to write data to "output.txt"
            FileOutputStream fos = new FileOutputStream("output.txt");
            
            // The string data to be written
            String s = "Hello everyone ...! welcome to Atmiya University";
            
            // Converts the string into bytes and writes it to the file
            fos.write(s.getBytes());
            
            System.out.println("file is ready now...");
            
            // Best practice: Close the stream after use
            fos.close(); 
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println(new File("output.txt").getAbsolutePath());
        }
    }  
}
