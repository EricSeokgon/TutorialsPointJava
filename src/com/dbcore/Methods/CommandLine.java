package com.dbcore.Methods;

/**
 * Project: TutorialsPointJava
 * FileName: CommandLine
 * Date: 2015-07-13
 * Time: 오전 10:24
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
