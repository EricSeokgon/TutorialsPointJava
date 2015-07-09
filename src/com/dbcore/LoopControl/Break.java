package com.dbcore.LoopControl;

/**
 * Project: TutorialsPointJava
 * FileName: Break
 * Date: 2015-07-09
 * Time: 오전 10:59
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Break {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
