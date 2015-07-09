package com.dbcore.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: TutorialsPointJava
 * FileName: sdfs
 * Date: 2015-07-09
 * Time: 오후 5:02
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class replaceAll  {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
            "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
