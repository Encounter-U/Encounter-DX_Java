package com.dongxin.day10.StringBuilderDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo3
    {
        public static void main(String[] args)
            {
                int length = str().substring(1).replace('a', 'q').length();
                System.out.println(length);

            }
        public static String str()
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("输入一个字符串");
                String next = sc.next();
                return next;
            }
    }
