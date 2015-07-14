package com.dbcore.Exceptions;

/**
 * Project: TutorialsPointJava
 * FileName: sdf
 * Date: 2015-07-15
 * Time: 오전 1:34
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
// File Name InsufficientFundsException.java
import java.io.*;

public class InsufficientFundsException extends Exception
{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}