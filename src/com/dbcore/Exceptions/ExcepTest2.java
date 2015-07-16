package com.dbcore.Exceptions;

/**
 * Project: TutorialsPointJava
 * FileName: asd
 * Date: 2015-07-14
 * Time: 오후 1:51
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ExcepTest2{

    public static void main(String args[]){
        int a[] = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        finally{
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}