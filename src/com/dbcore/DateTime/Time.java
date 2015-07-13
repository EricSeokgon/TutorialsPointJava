package com.dbcore.DateTime;

import java.util.Calendar;

/**
 * Project: TutorialsPointJava
 * FileName: Time
 * Date: 2015-07-10
 * Time: 오후 3:55
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Time {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        String year = (new Integer(today.get(today.YEAR))).toString();
        String month = (new Integer(today.get(today.MONTH)+1)).toString();
        if ( month.length() == 1 ) {
            month = "0" + month;
        }
        String date = (new Integer(today.get(today.DATE))).toString();
        if ( date.length() == 1) {
            date = "0" + date;
        }
        String nowDate = year + month + date;


        today.add(today.DATE,-14);
        year = (new Integer(today.get(today.YEAR))).toString();
        month = (new Integer(today.get(today.MONTH)+1)).toString();
        if ( month.length() == 1 ) {
            month = "0" + month;
        }
        date = (new Integer(today.get(today.DATE))).toString();
        if ( date.length() == 1) {
            date = "0" + date;
        }
        String preDate = year + month + date;

        System.out.println(nowDate);
        System.out.println(preDate);
    }
}
