package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/13
 */
public class StringDemo3
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入abc以比较大小：");
                String str1 = sc.next();//abc new出来的
                String str2 = "abc";
                System.out.println(str1 == str2);

                /**
                 * 结论：
                 * 以后只要想比较字符串里的内容，就必须要用String里面的方法
                 */
            }
    }
