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
public class ThrowsDemo {
        public static void main(String[] args) {
        int age = 55;

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

