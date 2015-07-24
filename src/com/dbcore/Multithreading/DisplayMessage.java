package com.dbcore.Multithreading;

/**
 * Project: TutorialsPointJava
 * FileName: sdfs
 * Date: 2015-07-25
 * Time: 오전 3:14
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
// File Name : DisplayMessage.java
// Create a thread to implement Runnable
public class DisplayMessage implements Runnable
{
    private String message;
    public DisplayMessage(String message)
    {
        this.message = message;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(message);
        }
    }
}
