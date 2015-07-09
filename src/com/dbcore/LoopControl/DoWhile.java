package com.dbcore.LoopControl;

/**
 * Project: TutorialsPointJava
 * FileName: DoWhile
 * Date: 2015-07-09
 * Time: 오전 10:40
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DoWhile {
    public static void main(String args[]){
        int x = 10;

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );
    }
}
