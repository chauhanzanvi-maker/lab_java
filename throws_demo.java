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
public class throws_demo {
    static void test() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }    
}
