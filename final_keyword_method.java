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
class university {

    final void display() {
        System.out.println("university");
    }
}
class  department extends university
{
    
}

public class final_keyword_method {
     public static void main(String[] args) {

        department d= new department();
        d.display();
    }
}
