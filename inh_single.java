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
class University
{
    void uninm()
    {
        System.out.println("Atmiya University");
    }
}

class Department extends University
{
    void deptnm()
    {
        System.out.println("Department of Computer Science");
    }
}

public class inh_single {
  public static void main(String args[])
    {
        Department d = new Department();

        d.uninm();
        d.deptnm();
    }   
}
