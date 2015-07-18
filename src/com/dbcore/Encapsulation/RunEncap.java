package com.dbcore.Encapsulation;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsdf
 * Date: 2015-07-19
 * Time: 오전 12:15
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : RunEncap.java */
public class RunEncap{

    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName()+
                " Age : "+ encap.getAge());
    }
}
