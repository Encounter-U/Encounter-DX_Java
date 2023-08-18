package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test6
    {
        /**
         * 设计一个方法求数组的最大值，并将最大值返回
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 5, 65, 28, 62, 75};
                int max = traverseMax(arr);
                System.out.println("该数组中最大值为：" + max);
            }

        public static int traverseMax(int[] arr)
            {
                int max = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (max < arr[i])
                            {
                                max = arr[i];
                            }
                    }
                return max;
            }
    }
