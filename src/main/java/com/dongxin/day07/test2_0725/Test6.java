package com.dongxin.day07.test2_0725;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test6
    {
        /**
         * 数字加密
         * 某系统的数字密码（大于0），比如628，采用加密方式传输
         * 规则如下：
         * 先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //键盘录入一串数字并分解
                int[] newArr = dismantle();
                //对数字进行加密
                System.out.println();
                System.out.print("加密之后的数组为：");
                for (int i = 0; i < newArr.length; i++)
                    {
                        newArr[i] = change(newArr[i]);
                        System.out.print(newArr[i] + " ");
                    }
                System.out.println();//此代码仅为换行
                //排列为一串新数字
                int newNum = combination(newArr);
                System.out.println("加密之后的数字为：" + newNum);
            }

        /**
         * 键盘录入一串大于0的整数并将每一位提取出来并存入数组中
         */
        public static int[] dismantle()
            {
                Scanner sc = new Scanner(System.in);
                while (true){
                    System.out.print("输入一个大于0的整数：");
                    int num = sc.nextInt();
                    if (num>0)
                        {
                            //强转数字类型
                            int length = String.valueOf(num).length();
                            //System.out.println(length);
                            //定义数组存放每位数字
                            int[] arr = new int[length];
                            System.out.print("数组中的每一位为：");
                            for (int i = 0; i < length; i++)
                                {
                                    int ten = (int) Math.pow(10, i);
                                    //System.out.print(ten+" ");
                                    //从右到左取出每一位数字并存在数组中
                                    arr[i] = num / ten % 10;
                                    System.out.print(arr[i] + " ");
                                }
                            return arr;
                        }
                }
            }

        /**
         * 对数字进行处理
         *
         * @param num
         * @return
         */
        public static int change(int num)
            {
                num = (num + 5) % 10;
                return num;
            }

        /**
         * 重新拼接数组中的元素
         *
         * @param arr
         * @return
         */
        public static int combination(int[] arr)
            {
                int newNum = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        newNum = newNum * 10 + arr[i];
                    }
                return newNum;
            }
    }
