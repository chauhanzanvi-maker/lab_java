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
final class demo {

    void display() {
        System.out.println("This is final class");
    }
}

public class final_keyword_class {
     public static void main(String[] args) {

        demo d = new demo();
        d.display();
    }
}
