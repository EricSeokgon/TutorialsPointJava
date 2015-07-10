package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: asdasd
 * Date: 2015-07-10
 * Time: 오전 9:43
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ExampleMinNumber{

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);
    }

    /** returns the minimum of two numbers */
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}
