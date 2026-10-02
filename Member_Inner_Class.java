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
class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
