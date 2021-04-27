package com.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Yuliya\\IdeaProjects\\Java Basics 2d part\\Files\\Conf.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));

    }
}
