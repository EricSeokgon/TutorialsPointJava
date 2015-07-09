package com.dbcore.LoopControl;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsd
 * Date: 2015-07-09
 * Time: 오전 10:43
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Enhancedforloop {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        String number = "";             //number 공백상태

        for (int x : numbers) {
            //System.out.print( x );
            //System.out.print(",");
            number += (number.equals("")) ? x : ", " + x + "";
        }
        System.out.println(number);

        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        String name = "";             //number 공백상태
        for (String x : names) {
            //System.out.print(name);
            //System.out.print(",");
            name += (name.equals("")) ? x : ", " + x + "";
        }
        System.out.println(name);
    }
}
