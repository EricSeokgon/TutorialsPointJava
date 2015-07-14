package com.dbcore.Exceptions;

/**
 * Project: TutorialsPointJava
 * FileName: sdf
 * Date: 2015-07-14
 * Time: 오후 1:48
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
// File Name : ExcepTest.java
import java.io.*;
public class ExcepTest{

    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
