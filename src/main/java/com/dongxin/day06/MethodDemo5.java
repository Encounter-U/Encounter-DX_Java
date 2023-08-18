package com.dongxin.day06;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class MethodDemo5
    {
        /**
         * 计算公司全年的营业额
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int one = turnover(90, 60, 30);
                allTurnover(one, one, one, one);
            }

        /**
         * 每个季度的营业额
         *
         * @param a
         * @param b
         * @param c
         * @return
         */
        public static int turnover(int a, int b, int c)
            {
                int result = a + b + c;
                return result;
            }

        /**
         * 由各个季度的营业额得出全年的营业额
         *
         * @param a
         * @param b
         * @param c
         * @param d
         */
        public static void allTurnover(int a, int b, int c, int d)
            {
                int result = a + b + c + d;
                System.out.println("全年的营业额为:" + result);
            }
    }
