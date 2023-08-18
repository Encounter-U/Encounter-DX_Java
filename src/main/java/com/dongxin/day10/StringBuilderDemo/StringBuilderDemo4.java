package com.dongxin.day10.StringBuilderDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo4
    {
        /**
         * 使用StringBuilder的场景：
         * 字符串的拼接
         * 字符串的反转
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个字符串：");
                String str = sc.next();
                judgement(str);
            }

        public static void judgement(String str)
            {
                StringBuilder sb = new StringBuilder(str);
                String rollback = sb.reverse().toString();
                if (str.equals(rollback))
                    {
                        System.out.println("是");
                    }
                else
                    {
                        System.out.println("不是");
                    }
            }
    }
