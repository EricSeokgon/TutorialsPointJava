package com.dbcore.Overriding;

/**
 * Project: TutorialsPointJava
 * FileName: asd
 * Date: 2015-07-17
 * Time: 오전 9:05
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Animal{

    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{

    public void move(){
        super.move(); //invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class TestDog{

    public static void main(String args[]){
        //Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        //a.move();// runs the method in Animal class

        b.move();//Runs the method in Dog class
    }
}
