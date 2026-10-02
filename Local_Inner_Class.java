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
public class Local_Inner_Class {

    void display() {

        class Inner {
            void show() {
                System.out.println("Hello from Local Inner class");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {

        Local_Inner_Class obj = new Local_Inner_Class();
        obj.display();
    }
    
}
