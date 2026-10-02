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
abstract class Bike {

    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}
class Honda extends Bike {

    void run() {
        System.out.println("Running safely");
    }
}

public class Abstract_Class_Abstract_Method {
     public static void main(String[] args) {

        Honda h = new Honda();

        h.run();
        h.changeGear();
    } 
}
