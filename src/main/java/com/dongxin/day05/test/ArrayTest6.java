package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest6
    {
        /**
         * 定义一个数组，存入1，2，3，4，5。按照要求索引对应的元素
         * 交换前：1，2，3，4，5
         * 交换后：5，2，3，4，1
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr={1,2,3,4,5};
                int change=arr[0];
                arr[0]=arr[4];
                arr[4]=change;
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
            }
    }
