package com.wztcode.test;

import java.lang.reflect.Method;

public class UserServletTest {
    public void login() {
        System.out.println("这是 login() 方法");
    }

    public void regist() {
        System.out.println("这是 regist() 方法");
    }

    public void updateUser() {
        System.out.println("这是 updateUser() 方法");
    }

    public void updateUserPassword() {
        System.out.println("这是 updateUserPassword() 方法");
    }

    public static void main(String[] args) {
        String action = "updateUserPassword";
        try {
            Method method = UserServletTest.class.getDeclaredMethod(action);
            method.invoke(new UserServletTest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
