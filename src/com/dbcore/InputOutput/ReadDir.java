package com.dbcore.InputOutput;

/**
 * Project: TutorialsPointJava
 * FileName: asddfs
 * Date: 2015-07-13
 * Time: 오후 2:11
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;

public class ReadDir {
    public static void main(String[] args) {

        File file = null;
        String[] paths;

        try{
            // create new file object
            file = new File("/tmp");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
