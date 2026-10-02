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
public class String_Methods {
     public static void main(String[] args) {

        String str = "Hello Java Programming";
        String str2 = "hello java programming";

        // 1. length()
        System.out.println("1. length(): " + str.length());

        // 2. charAt(int i)
        System.out.println("2. charAt(): " + str.charAt(6));

        // 3. substring(int i)
        System.out.println("3. substring(i): " + str.substring(6));

        // 4. substring(int i, int j)
        System.out.println("4. substring(i,j): " + str.substring(0, 5));

        // 5. concat(String str)
        System.out.println("5. concat(): " + str.concat(" Course"));

        // 6. indexOf(String s)
        System.out.println("6. indexOf(String): " + str.indexOf("Java"));

        // 7. indexOf(String s, int i)
        System.out.println("7. indexOf(String,int): " + str.indexOf("a", 7));

        // 8. lastIndexOf(int ch)
        System.out.println("8. lastIndexOf(int): " + str.lastIndexOf('a'));

        // 9. equals(Object otherObj)
        System.out.println("9. equals(): " + str.equals(str2));

        // 10. equalsIgnoreCase(String anotherString)
        System.out.println("10. equalsIgnoreCase(): "
                + str.equalsIgnoreCase(str2));

        // 11. compareTo(String anotherString)
        System.out.println("11. compareTo(): " + str.compareTo(str2));

        // 12. compareToIgnoreCase(String anotherString)
        System.out.println("12. compareToIgnoreCase(): "   
                + str.compareToIgnoreCase(str2));

        // 13. toLowerCase()
        System.out.println("13. toLowerCase(): " + str.toLowerCase());

        // 14. toUpperCase()
        System.out.println("14. toUpperCase(): " + str.toUpperCase());

        // 15. trim()
        String s = "   Hello Java   ";
        System.out.println("15. trim(): " + s.trim());

        // 16. replace(char oldChar, char newChar)
        System.out.println("16. replace(): " + str.replace('a', 'A'));
    }
}
