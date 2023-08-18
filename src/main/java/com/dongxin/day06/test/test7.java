package com.dongxin.day06.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/23
 */

public class test7
    {
        /**
         * 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 5, 6};
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个整数：");
                int num = sc.nextInt();
                if (judgmentExistence(arr, num))
                    {
                        System.out.println("该数存在于数组中");
                    }
                else
                    {
                        System.out.println("该数不存在于数组中");
                    }
            }

        public static boolean judgmentExistence(int[] arr, int num)
            {
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] == num)
                            {
                                //当return运行之后循环也会结束
                                return true;
                            }
                    }
                return false;
            }
    }
