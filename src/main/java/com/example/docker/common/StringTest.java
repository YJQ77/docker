package com.example.docker.common;

import java.util.Collection;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("abc");
        sb.reverse();
        System.out.println(sb);
        byte[] bytes = sb.toString().getBytes();
        for (byte b:bytes){
            System.out.println(b);
        }

        String s = new String(bytes);
        System.out.println(s);

    }
}
