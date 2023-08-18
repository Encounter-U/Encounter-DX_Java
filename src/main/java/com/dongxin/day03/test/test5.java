package com.dongxin.day03.test;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class test5
    {
        /**
         * 三元运算符练习2
         * 三人身高分别为150cm,210cm,165cm,判断三人最高身高
         * @param args
         */
        public static void main(String[] args)
            {
                int a = 150;
                int b = 210;
                int c = 165;
                int i = a > b ? a : b;
                int max = i > c ? i : c;
                System.out.println("三人中最高身高为：" + max + "cm");
            }
    }
