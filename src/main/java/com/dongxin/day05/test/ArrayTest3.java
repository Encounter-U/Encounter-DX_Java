package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest3
    {
        /**
         * 定义一个数组，存储到1，2，3，4，5，6，7，8，9，10
         * 遍历得到每一个元素
         * 要求：
         * 1.若为奇数，则将当前数字扩大两倍
         * 2.若为偶数，则将当前数字变为二分之一
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] % 2 == 1)
                            {
                                arr[i] = arr[i] * 2;
                            }
                        else
                            {
                                arr[i] = arr[i] / 2;
                            }
                    }
                /**
                 * 今后注意，一个循环尽量只做一件事
                 */
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print("a[" + i + "]:" + arr[i] + "\t");
                    }
            }
    }
