package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test5
    {
        /**
         * 设计一个方法用于数组遍历
         * 要求结果是在一行上的
         * 例如：[11,22,33,44,55]
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                traverse(arr);
            }

        public static void traverse(int[] arr)
            {
                System.out.print("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        if (i == arr.length - 1)
                            {
                                System.out.print(arr[i]);
                            }
                        else
                            {
                                System.out.print(arr[i] + ",");
                            }
                    }
                System.out.println("]");
            }
    }
