package com.dongxin.day05.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test3
    {
        /**
         * 键盘录入一个正整数x，判断它是否是一个质数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("输入一个正整数：");
                int x = sc.nextInt();
                /**
                 * 定义一个标记变量flag,设置默认为true，即默认为质数
                 * true：是质数
                 * false：不是质数
                 */
                boolean flag = true;
                if (x > 0)
                    {
                        for (int i = 2; i <= x - 1; i++)
                            {
                                if (x % i == 0)
                                    {
                                        //若不是质数则修改flag的值
                                        flag = false;
                                        //System.out.println(x + "不是质数");
                                        break;
                                    }
                            }
                        if (flag)
                            {
                                System.out.println(x + "是一个质数");
                            }
                        else
                            {
                                System.out.println(x + "不是一个质数");
                            }
                    }
                else
                    {
                        System.out.println("输入的不对");
                    }
            }
    }
