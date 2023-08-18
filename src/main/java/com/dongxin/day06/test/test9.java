package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test9
    {
        /**
         * 改代码用于了解内存
         * 详见黑马Java课程P73
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int num = 100;
                System.out.println("更改之前：" + num);
                num = change(num);
                System.out.println("更改之后：" + num);
            }

        public static int change(int num)
            {
                num = 200;
                return num;
            }
    }
