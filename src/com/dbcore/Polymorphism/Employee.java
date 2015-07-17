package com.dbcore.Polymorphism;

/**
 * Project: TutorialsPointJava
 * FileName: ssd
 * Date: 2015-07-17
 * Time: 오전 9:24
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
/* File name : Employee.java */
public class Employee
{
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number)
    {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}
