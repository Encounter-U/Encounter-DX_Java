package com.dongxin.day06.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test8
    {
        /**
         * 定义一个方法copyOfRange(int[] arr,int from,int to)
         * 功能：
         * 将数组arr从索引from（包含from）开始
         * 到索引to（不包含to）的元素复制到新数组中，
         * 将新数组返回
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                Scanner sc = new Scanner(System.in);
                System.out.print("输入要复制的起始位置：");
                int from = sc.nextInt();
                System.out.print("输入要复制的结束位置：");
                int to = sc.nextInt();
                if (copyOfRange(arr, from, to) != null)
                    {
                        int[] newArr = copyOfRange(arr, from, to);
                        traverse(newArr);
                    }
            }

        /**
         * 复制数组
         *
         * @param arr
         * @param from
         * @param to
         * @return
         */
        public static int[] copyOfRange(int[] arr, int from, int to)
            {
                if (to > from && from >= 0 && to <= arr.length)
                    {
                        int[] copyArr = new int[to - from];
                        //伪造索引思想
                        int index = 0;
                        for (int i = from; i < to; i++)
                            {
                                copyArr[index] = arr[i];
                                index++;
                            }
                        return copyArr;
                    }
                else
                    {
                        System.out.println("输入的数据有误");
                    }
                return null;
            }

        /**
         * 遍历数组
         *
         * @param arr
         */
        public static void traverse(int[] arr)
            {
                System.out.print("数组中元素为：");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }
