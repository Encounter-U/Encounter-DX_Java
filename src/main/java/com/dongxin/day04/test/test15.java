package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test15
    {
        /**
         * 键盘录入两个数，计算两数之间能同时被3和5整除的数的和
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入较小的数字：");
                int first = sc.nextInt();
                System.out.print("请输入较大的数字：");
                int second = sc.nextInt();
                int sum = 0;
                if (first < second)
                    {
                        for (int i = first; i <= second; i++)
                            {
                                if (i % 3 == 0 && i % 5 == 0)
                                    {
                                        sum += i;
                                    }
                            }
                        System.out.println(sum);
                    }
                else
                    {
                        System.out.println("输入有误");
                    }
            }
    }
