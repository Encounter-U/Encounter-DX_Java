package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/14
 */
public class StringDemo6
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个字符串：");
                String str = sc.next();
                int bigCount = 0;//大写
                int smallCount = 0;//小写
                int numCount = 0;//数字
                for (int i = 0; i < str.length(); i++)
                    {
                        char c = str.charAt(i);
                        if (c >= 'a' && c <= 'z')
                            {
                                //char类型的变量在参与计算时自动类型提升为int，查询ASCII码表
                                smallCount++;
                            }
                        else if (c >= 'A' && c <= 'Z')
                            {
                                bigCount++;
                            }
                        //c为char类型字符，所以数字也要为字符类型，或者转为为ASCII码表里的数字再比较
                        else if (c >= '0' && c <= '9')
                            {
                                numCount++;
                            }
                    }
                System.out.println("大写字母：" + bigCount);
                System.out.println("小写字母：" + smallCount);
                System.out.println("数字：" + numCount);
            }
    }
