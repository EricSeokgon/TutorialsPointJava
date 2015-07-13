package com.dbcore.InputOutput;

/**
 * Project: TutorialsPointJava
 * FileName: sdfsd
 * Date: 2015-07-13
 * Time: 오후 2:09
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // Create directory now.
        d.mkdirs();
    }
}
