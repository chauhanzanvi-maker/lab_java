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
public class fileinput_strem {
    public static void main(String[] args) {
        try {
            // Opens a connection to the specified file
            FileInputStream fis = new FileInputStream("output.txt");
            int ch;
            
            // Reads character by character until the end of the file (-1)
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            
            // Good practice: close the stream when done
            fis.close(); 
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(new File("output.txt").getAbsolutePath());
        }
    }    
}
