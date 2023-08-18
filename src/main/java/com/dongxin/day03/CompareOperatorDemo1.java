package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class CompareOperatorDemo1
    {
        /**
         * 以“==”为例，!=,>,>=,<,<=均类似
         * 关系运算符结果均为Boolean类型
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //== 判断左右两边是否相等
                int a = 10;
                int b = 10;
                int c = 20;
                System.out.println(a == b);
                System.out.println(a == c);
            }
    }
