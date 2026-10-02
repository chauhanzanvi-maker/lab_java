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
class A
{
    int a = 10;
}

class B extends A
{
    int a = 20;

    public void display()
    {
        System.out.println("Value: " + a);
    }
}

public class superkeyword_variable {
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();   
    }
}
