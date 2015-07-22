package com.dbcore.Generics;

/**
 * Project: TutorialsPointJava
 * FileName: dsfs
 * Date: 2015-07-22
 * Time: 오전 10:16
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}
