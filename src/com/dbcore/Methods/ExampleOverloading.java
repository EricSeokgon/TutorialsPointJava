package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: ExampleOverloading
 * Date: 2015-07-13
 * Time: 오전 10:10
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ExampleOverloading {

    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);
        double result2 = minFuction(c, d);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public static double minFuction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else min = n1;

        return min;
    }


}
