package com.dbcore.DateTime;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsdf
 * Date: 2015-07-09
 * Time: 오후 4:41
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

public class DiffDemo {

    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
