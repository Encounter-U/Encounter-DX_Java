package com.dongxin.day07.test2_0725;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test7
    {
        /**
         * 上接Test6
         * 把整数中的每一位添加到数组当中
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个正整数：");
                int num = sc.nextInt();
                //储存num的值
                int temp = num;
                //计算输入的数字的长度
                int count = 0;
                while (num != 0)
                    {
                        //每运行一次减少一位
                        num = num / 10;
                        count++;
                    }
                //System.out.println(count);
                int[] arr = new int[count];
                for (int i = arr.length - 1; i >= 0; i--)
                    {
                        arr[i] = temp % 10;
                        temp /= 10;
                    }
                System.out.print("数组内元素为：");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }
