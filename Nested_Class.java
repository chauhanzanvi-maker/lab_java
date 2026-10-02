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


class Student {
    String name = "Zanvi";

    class Details {
        void show() {
            System.out.println("Student Name: " + name);
        }
    }

        public static void main(String[] args) {
        Student s = new Student();
        Student.Details d = s.new Details();
        d.show();
    }
}    
