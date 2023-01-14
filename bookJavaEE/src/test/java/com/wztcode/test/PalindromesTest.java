package com.wztcode.test;

import java.util.Scanner;

public class PalindromesTest {
    public static void main(String[] args) {
        // 5位数-6位数之间所有的回文数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long start = System.currentTimeMillis();
        for (int i = 10000; i <= 1000000; i++) {
            String value = String.valueOf(i);
            char[] chars = value.toCharArray();
            if (value.length() == 5) {
                if (chars[0] == chars[4] && chars[1] == chars[3]) {
                    int temp = 0;
                    for (int j = 0; j < chars.length; j++) {
                        temp += Integer.parseInt(String.valueOf(chars[j]));
                    }
//                    System.out.println(temp);
                    if (temp == num) {
                        System.out.println(value);
                    }
                }
            }
            if (value.length() == 6) {
                if (chars[0] == chars[5] && chars[1] == chars[4] && chars[2] == chars[3]) {
                    int temp = 0;
                    for (int j = 0; j < chars.length; j++) {
                        temp += Integer.parseInt(String.valueOf(chars[j]));
                    }
//                    System.out.println(temp);
                    if (temp == num) {
                        System.out.println(value);
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + (end - start));
    }
}
