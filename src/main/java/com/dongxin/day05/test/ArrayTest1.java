package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest1
    {
        /**
         * 定义一个数组，存储1，2，3，4，5
         * 遍历数组得到每一个元素，求数组里所有数据的和
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5};
                int sum = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.println(arr[i]);
                        sum = sum + arr[i];
                    }
                System.out.println("和为："+sum);
            }

    }
