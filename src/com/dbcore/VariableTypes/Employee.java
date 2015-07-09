package com.dbcore.VariableTypes;

/**
 * Project: TutorialsPointJava
 * FileName: sadf
 * Date: 2015-07-09
 * Time: 오전 10:09
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;

public class Employee{
    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee (String empName){
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal){
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp(){
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]){
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
