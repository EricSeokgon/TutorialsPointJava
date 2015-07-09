package com.dbcore.LoopControl;

/**
 * Project: TutorialsPointJava
 * FileName: Continue
 * Date: 2015-07-09
 * Time: 오전 11:00
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Continue {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
