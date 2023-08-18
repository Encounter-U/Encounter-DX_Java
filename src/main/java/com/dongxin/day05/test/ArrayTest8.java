package com.dongxin.day05.test;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest8
    {
        /**
         * 将数组中数据随机打乱
         * 进阶版
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                Random r = new Random();
                for (int i = 0; i < arr.length; i++)
                    {
                        //在无限循环中生成随机数直到生成与i不同的随机数
                        while (true)
                            {
                                //生成一个数组中的随机索引
                                int m = r.nextInt(arr.length);
                                if (m != i)
                                    {
                                        int temp = arr[i];
                                        arr[i] = arr[m];
                                        arr[m] = temp;
                                        break;
                                    }
                            }

                    }
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }
