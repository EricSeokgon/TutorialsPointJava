package com.dbcore.Abstraction;

/**
 * Project: TutorialsPointJava
 * FileName: ㄴㅇㄹ
 * Date: 2015-07-18
 * Time: 오전 12:18
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : AbstractDemo.java */
public class AbstractDemo
{
    public static void main(String [] args)
    {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}