package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class TernaryOperatorDemo1
    {
        public static void main(String[] args)
            {
                int a = 10;
                int b = 20;
                //使用三元运算符获取两个整数的最大值,true为a,反之为b
                int max = a > b ? a : b;
                System.out.println(max);
            }
    }
