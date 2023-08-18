package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test17
    {
        /**
         * 力扣题：
         * 给一个整数x
         * 若x是一个回文整数，打印true，反之打印false
         * 回文数是指正序和倒序读都一样的整数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入一个数字：");
                int x = sc.nextInt();
                //定义一个临时变量用于记录x原来的量，用于最后比较
                int temp = x;
                //记录倒过来之后的结果
                int num = 0;
                while (x != 0)
                    {
                        //从右到左获取每一位数字
                        int g = x % 10;
                        //对x重新赋值
                        x = x / 10;
                        //新数字
                        num = num * 10 + g;
                    }
                if (num == temp)
                    {
                        System.out.println("true");
                    }
                else
                    {
                        System.out.println("false");
                    }
            }
    }
