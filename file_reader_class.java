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
public class file_reader_class {
    public static void main(String[] args) {
        try {
            // Replace "input.txt" with your actual file name
            FileReader fr = new FileReader("input.txt"); 
            int ch;
            
            // Read character by character until the end of the file (-1)
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Cast the integer to a character and print
            }
            
            fr.close(); // Always close your file streams
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println(new File(".").getAbsolutePath());
        }
    }    
}
