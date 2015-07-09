package com.dbcore.DateTime;

/**
 * Project: TutorialsPointJava
 * FileName: FormatDate
 * Date: 2015-07-09
 * Time: 오후 4:27
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();

        String str = String.format("Current Date/Time : %tc", date);

        System.out.printf(str);
    }

}
