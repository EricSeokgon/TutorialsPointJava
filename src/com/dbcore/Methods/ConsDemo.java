package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: ConsDemo
 * Date: 2015-07-13
 * Time: 오전 10:32
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);

        System.out.println(t1.x + " " + t2.x);
    }
}
