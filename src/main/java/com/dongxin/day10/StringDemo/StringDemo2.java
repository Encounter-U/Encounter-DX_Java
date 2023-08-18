package com.dongxin.day10.StringDemo;

/**
 * @author Encounter
 * @date 2023/8/13
 */
public class StringDemo2
    {
        public static void main(String[] args)
            {
                //创建两个字符串比较
                String s1 = new String("abc");
                String s2 = "abc";
                String s3 = "Abc";

                /**
                 * ==号比较
                 * 基本数据类型：比的是数据
                 * 引用数据类型：比的是地址值
                 */
                System.out.println("==号s1与s2："+(s1 == s2));//false

                //比较字符串对象中的内容是否相等
                boolean result1 = s1.equals(s2);
                System.out.println(result1);//true
                System.out.println(s1.equals(s3));//false

                /**
                 *比较字符串对象中的内容是否相等，忽略大小写
                 * 1 一 壹 不可以
                 * 忽略大小写仅限英文状态下的a A
                 */
                System.out.println(s1.equalsIgnoreCase(s3));//true
            }
    }
