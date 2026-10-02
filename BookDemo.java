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
class Book
{
    String title;
    double price;
    void getBook()
    {
        title="java programming";
        price=499.50;
    }
    void putBook()
    {
        System.out.println("Book title: " +title);
        System.out.println("Book Price: " +price);
    }
}
public class BookDemo {
    public static void main(String[] args)
    {
        Book b=new Book();
        b.getBook();
        b.putBook();
        
    }
    
}
