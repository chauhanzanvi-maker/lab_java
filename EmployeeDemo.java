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
class Employee
{
    int id;
    String name;
    double salary;
    void getData()
    {
        id=101;
        name="Drashti thakar";
        salary=45000.0;
    }
    void putData()
    {
        System.out.println("Employee ID: " +id);
        System.out.println("Employee name: " +name);
        System.out.println("Employee salary: " +salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args)
    {
        Employee emp=new Employee();
        emp.getData();
        emp.putData();
    }
    
}
