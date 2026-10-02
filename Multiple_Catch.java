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
public class Multiple_Catch {
     public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }   
}
