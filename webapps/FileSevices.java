/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread2.readwrite;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jared
 */
public class FileSevices {
    public static List<String> readUsers(String url) throws FileNotFoundException, IOException {
        List<String> contentList = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            String content = "";
            reader = new BufferedReader(new FileReader(url));            
            while ((content = reader.readLine()) != null) {
                contentList.add(content);
            }
        } catch (Exception e) {
            e.printStackTrace();    
        } finally {  
           reader.close();
           return contentList;           
        }
    }
    
    //writes list to file, line by line
    public static void writeFile(List<String> commentList, String url) {
       try {            
            File file = new File(url);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
         //write out list of comments line by line
            for (String currentComment : commentList) {
                bw.write(currentComment + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
 
    //read file line by line into list
    public static List<String> readFile(String url) {
            List<String> commentList = new ArrayList<String>();
            try {
            BufferedReader bf = new BufferedReader(new FileReader(url));
            String line;
            while ((line = bf.readLine()) != null) {
                commentList.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return commentList;
    }
}
