package com.dbcore.BasicOperators;

/**
 * Project: TutorialsPointJava
 * FileName: Test
 * Date: 2015-07-09
 * Time: 오전 10:30
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String args[]){
        int a , b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}