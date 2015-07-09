/**
 * Project: TutorialsPointJava
 * FileName: asd
 * Date: 2015-07-09
 * Time: 오전 9:45
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
public class EmployeeTest{

    public static void main(String args[]){
      /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
