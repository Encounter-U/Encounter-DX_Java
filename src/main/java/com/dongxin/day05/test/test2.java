package com.dongxin.day05.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test2
    {
        /**
         * 力扣算法题：
         * 键盘录入一个大于等于2的整数x，计算并返回x的平方根
         * 结果只保留整数部分，小数部分将被舍去
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("输入一个大于等于2的整数：");
                int x = sc.nextInt();
                /*int n=0;
                if (x >= 2)
                {
                    for (int i = 1; i*i <= x; i++)
                        {
                            n=i;
                            *//*if (n*n>x)
                                {
                                    break;
                                }*//*
                        }
                    System.out.println(x+"的平方根取整为："+n);
                }
            else
                {
                    System.out.println("输入的不对");
                }*/
                if (x >= 2)
                    {
                        for (int i = 1; i < x; i++)
                            {
                                if (i * i == x)
                                    {
                                        System.out.println(x + "的平方根为：" + i);
                                        break;
                                    }
                                else if (i * i > x)
                                    {
                                        System.out.println(x + "的平方根取整为：" + (i - 1));
                                        break;
                                    }
                            }
                    }
                else
                    {
                        System.out.println("输入的数不对");
                    }
            }
    }