package com.dbcore.Arrays;

/**
 * Project: TutorialsPointJava
 * FileName: asdf
 * Date: 2015-07-09
 * Time: 오후 2:57
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestArray {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        String num ="";

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        for (double x : myList) {
            num += (num.equals("")) ? x : ", " + x + "";
        }
        System.out.println("num is " + num);

        // Print all the array elements
        for (double element: myList) {
            System.out.println(element);
        }
    }
}
