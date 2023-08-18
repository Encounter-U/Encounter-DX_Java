package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest4
    {
        /**
         * 已知数组元素为{33，5，22，44，55}
         * 找出数组中最大值并打印在控制台
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {33, 5, 22, 44, 55};
                /**
                 * 求数组中最大值
                 * 注意：
                 * max不能设置默认为0，因为数组里数据的正负不确定
                 * 一定要是数组中的值
                 */
                int max = arr[0];
                //从0开始时自己和自己比较，多一次循环，从1开始可提高效率
                for (int i = 1; i < arr.length; i++)
                    {
                        if (arr[i] > max)
                            {
                                max = arr[i];
                            }
                    }
                System.out.println("数组中最大值为：" + max);
                /**
                 * 求数组中最小值
                 */
                int min = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] < min)
                            {
                                min = arr[i];
                            }
                    }
                System.out.println("数组中最小值为：" + min);
            }
    }
