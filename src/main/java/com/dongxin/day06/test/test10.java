package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test10
    {
        /**
         * 此代码用于了解内存
         * 详见黑马Java课程P73
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {10, 20, 30};
                System.out.println("调用change前：" + arr[1]);
                change(arr);
                System.out.println("调用change后：" + arr[1]);
            }

        public static void change(int[] arr)
            {
                arr[1] = 200;
            }
    }
