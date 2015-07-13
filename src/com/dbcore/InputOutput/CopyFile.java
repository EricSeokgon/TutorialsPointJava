package com.dbcore.InputOutput;

import java.io.*;

/**
 * Project: TutorialsPointJava
 * FileName: CopyFile
 * Date: 2015-07-13
 * Time: 오후 1:39
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {

        //FileInputStream in = null;
        //FileOutputStream out = null;

        FileReader in = null;
        FileWriter out = null;

        try {
            //in = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\input.txt");
            //out = new FileOutputStream("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\output.txt");//in = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\input.txt");
            in = new FileReader("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\input.txt");
            out = new FileWriter("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\output.txt");//in = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\TutorialsPointJava\\src\\com\\dbcore\\InputOutput\\input.txt");


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
