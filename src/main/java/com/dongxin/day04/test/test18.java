package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test18
    {
        /**
         * 力扣题：
         * 给定两个整数，被除数和除数（均为正数，且不超过int的范围）
         * 将两数相除，要求不使用乘法，除法和%运算符
         * 得到商和余数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入被除数：");
                int dividend = sc.nextInt();
                System.out.println("请输入除数");
                int divisor = sc.nextInt();
                int count = 0;
                int num = dividend;
                if (dividend > 0 && divisor != 0)
                    {
                        while (dividend > divisor)
                            {
                                dividend = dividend - divisor;
                                count++;
                            }
                        System.out.println(num + "除以" + divisor + "的商为" + count + ",余数为" + dividend);
                    }
                else
                    {
                        System.out.println("输入有误！");
                    }
            }
    }
