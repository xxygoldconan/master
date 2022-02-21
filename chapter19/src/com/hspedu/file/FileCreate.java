package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Xu
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01(){
        String filepath = "D:\\news.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void create02(){
        File parentFile = new File("D:\\");
        String filepath = "news02.txt";
        File file = new File(parentFile, filepath);
        try {
            file.createNewFile();
            System.out.println("文件02创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void create03(){
        String parentPath = "D:\\";
        String filePath = "news03.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("new03创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
