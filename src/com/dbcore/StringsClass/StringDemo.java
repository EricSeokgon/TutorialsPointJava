package com.dbcore.StringsClass;

/**
 * Project: TutorialsPointJava
 * FileName: asdas
 * Date: 2015-07-09
 * Time: 오전 11:25
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringDemo {

    public static void main(String args[]) {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );

        String string1 = "saw I was ";
        System.out.println("Dot " + string1 + "Tod");

        String string2 = "Tedra ";
        System.out.println(string1.concat(string2));
    }
}