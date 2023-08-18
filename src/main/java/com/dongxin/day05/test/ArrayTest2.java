package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest2
    {
        /**
         * 定义一个数组，存储1，2，3，4，5，6，7，8，9，10
         * 遍历得到每一个元素，统计数组中共有多少个能被3整除的数字
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int count = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] % 3 == 0)
                            {
                                count++;
                            }
                    }
                System.out.println("能被3整除的数字有"+count+"个");
            }
    }
