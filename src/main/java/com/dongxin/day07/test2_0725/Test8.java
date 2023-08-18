package com.dongxin.day07.test2_0725;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test8
    {
        /**
         * 数字解密
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //键入一个数字
                Scanner sc = new Scanner(System.in);
                System.out.println("输入一个整数：");
                int num = sc.nextInt();
                //把数字存入数组
                int[] numArr = dismantle(num);
                //反转

                //逆转对10取余
                for (int i = 0; i < numArr.length; i++)
                    {
                        numArr[i] = reversion(numArr[i]);
                        //System.out.print(numArr[i] + " ");
                    }
                //组合
                int newNum = combination(numArr);
                System.out.println("解密之后的数字为：" + newNum);
            }

        public static int[] dismantle(int num)
            {
                //储存num
                int temp = num;
                //计算num的长度
                int count = 0;
                while (num != 0)
                    {
                        num = num / 10;
                        count++;
                    }
                //定义数组储存
                int[] arr = new int[count];
                for (int i = 0; i < arr.length; i++)
                    {
                        arr[i] = temp % 10;
                        temp /= 10;
                    }
                return arr;
            }

        /**
         * 逆转
         *
         * @param num
         */
        public static int reversion(int num)
            {
                if (num >= 5)
                    {
                        num -= 5;
                    }
                else
                    {
                        num = (num + 10) - 5;
                    }
                return num;
            }

        /**
         * 组合
         */
        public static int combination(int[] arr)
            {
                int num = 0;
                for (int i = arr.length - 1; i >= 0; i--)
                    {
                        num = arr[i] * 10 + num;
                    }
                return num;
            }
    }
