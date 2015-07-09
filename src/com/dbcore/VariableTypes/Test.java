package com.dbcore.VariableTypes;

/**
 * Project: TutorialsPointJava
 * FileName: Test
 * Date: 2015-07-09
 * Time: 오전 10:06
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}
