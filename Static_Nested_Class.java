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


public class Static_Nested_Class {

    static int number = 10;

    static class Inner {
        void display() {
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args) {
        Static_Nested_Class.Inner obj = new Static_Nested_Class.Inner();
        obj.display();
    }
}
