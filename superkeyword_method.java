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
class a
{
    void show()
    {
        System.out.println("From class A...");
    }
}

class b extends a
{
    void show()
    {
        super.show();
        System.out.println("From class B...");
    }
}

public class superkeyword_method {
  public static void main(String args[])
    {
        b obj = new b();
        obj.show();
    }   
}
