package com.example.docker.common;

import java.lang.reflect.Method;

public class ReflectCase {
    public static void main(String[] args) throws Exception {
        Proxy target = new Proxy();
        Method method = Proxy.class.getDeclaredMethod("run2");
        method.invoke(target);
    }

    static class Proxy {
        public void run() {
            System.out.println("run");
        }
        public void run2() {
            System.out.println("run2");
        }
    }
}
