package com.dbcore.DecisionMaking;

/**
 * Project: TutorialsPointJava
 * FileName: Switch
 * Date: 2015-07-09
 * Time: 오전 11:07
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Switch {
    public static void main(String args[]) {
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
