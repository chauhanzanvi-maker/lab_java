/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zanvi_fswd;

/**
 *
 * @author chauh
 */
public class Nested_try {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try");

            try {
                int a = 10 / 0;
                System.out.println(a);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        catch (Exception e) {
            System.out.println("Outer catch");
        }
    }    
}
