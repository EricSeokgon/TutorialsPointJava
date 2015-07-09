package com.dbcore.BasicOperators;

/**
 * Project: TutorialsPointJava
 * FileName: asd
 * Date: 2015-07-09
 * Time: 오전 10:32
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Vehicle {
}

public class Car extends Vehicle {
    public static void main(String args[]) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println("Car == a :" + result);

        String name = "James";
        // following will return true since name is type of String
        boolean result2 = name instanceof String;
        System.out.println("name ='James' instanceof String :" + result2);
    }
}
