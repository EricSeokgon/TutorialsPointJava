package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsdf
 * Date: 2015-07-10
 * Time: 오전 9:52
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ExampleVoid {

    public static void main(String[] args) {
        methodRankPoints(255.7);
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }
        else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }
        else {
            System.out.println("Rank:A3");
        }
    }
}
