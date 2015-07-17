package com.dbcore.Polymorphism;

/**
 * Project: TutorialsPointJava
 * FileName: asda
 * Date: 2015-07-17
 * Time: 오전 9:27
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : VirtualDemo.java */
public class VirtualDemo
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
