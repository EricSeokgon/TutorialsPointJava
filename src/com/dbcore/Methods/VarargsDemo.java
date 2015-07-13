package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: VarargsDemo
 * Date: 2015-07-13
 * Time: 오전 10:35
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class VarargsDemo {
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];
        System.out.println("The max value is " + result);

    }
}