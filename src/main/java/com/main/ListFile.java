package com.main;

import java.io.File;

/**
 *
 */
public class ListFile {
    public static void main(String[] args) {
        File f = new File("D:\\");
        for (File t : f.listFiles()) {
            if(t.isDirectory()) {
                System.out.println(t.getName());
            }
        }
    }
}