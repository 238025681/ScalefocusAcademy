/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.file_stream.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Chobi
 */
public class P08_GetFolderSize {

    public static void main(String[] args) {
        String path = "C:\\ScaleFocus\\readFile\\Excercise\\"
                + "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File file = new File(path);
        int result = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                    result += f.length();
                    }
                }
            }
        }
                        System.out.println("Folder size: "+result);
    }
}
