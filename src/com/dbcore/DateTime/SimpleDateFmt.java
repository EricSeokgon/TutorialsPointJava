package com.dbcore.DateTime;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsdf
 * Date: 2015-07-09
 * Time: 오후 4:21
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import java.text.*;

public class SimpleDateFmt {
    public static void main(String args[]) {

        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
