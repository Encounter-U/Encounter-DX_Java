package com.dongxin.day05.test;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayTest5
    {
        /**
         * 斯坦福大学Java入门练习（1、2问为拓展，3为原题）
         * 生成10个1~100之间的随机数存入数组
         * 1.求出所有数据的和
         * 2.求所有数据的平均数
         * 3.统计有多少个数据比平均值小
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //创建数组
                int[] arr = new int[10];
                //生成随机数并存入数组
                for (int i = 0; i < arr.length; i++)
                    {
                        //生成随机数
                        Random r = new Random();
                        int num = r.nextInt(100)+1;
                        arr[i] = num;
                    }
                //遍历出数组中所有数据
                System.out.println("数组中的所有数据：");
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + "\t\t");
                    }
                System.out.println("");
                System.out.println("解答：");
                //求所有数据的和
                int sum = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        sum += arr[i];
                    }
                System.out.println("1.所有数据之和为：" + sum);
                //求所有数据的平均数
                int average = sum / arr.length;
                System.out.println("2.所有数据的平均数为：" + average);
                //统计有多少个数据比平均值小
                int count = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] < average)
                            {
                                count++;
                            }
                    }
                System.out.println("3.共有" + count + "个数据比平均值" + average + "小");
            }
    }
