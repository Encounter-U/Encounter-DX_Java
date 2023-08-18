package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/14
 */
public class StringDemo5
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个字符串:");
                String str = sc.next();
                System.out.println("字符串长度为："+str.length());
                for (int i = 0; i < str.length(); i++)
                    {
                        System.out.print(str.charAt(i) + " ");
                    }
            }
    }
