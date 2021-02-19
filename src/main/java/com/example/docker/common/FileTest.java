package com.example.docker.common;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        count();
    }

    public static void count(){

        File file = new File("C:\\Users\\Administrator\\Desktop\\filetest.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b = new byte[8];
        int a = 0;
        try {
            while ((a = is.read(b))!=-1){
                String s = new String(b, 0, a,"utf-8");
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] str = new String(b, 0, a).split("");
        int count = 0;
        for(int i = 0;i<str.length;i++){
            //设置查询统计的字符串为a
            if("a".equals(str[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
