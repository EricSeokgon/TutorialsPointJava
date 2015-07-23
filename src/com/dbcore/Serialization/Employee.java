package com.dbcore.Serialization;

/**
 * Project: TutorialsPointJava
 * FileName: sfsdf
 * Date: 2015-07-23
 * Time: 오전 10:37
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
