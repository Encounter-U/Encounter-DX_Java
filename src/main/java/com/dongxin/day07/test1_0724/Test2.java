package com.dongxin.day07.test1_0724;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/24
 */
public class Test2
    {
        /**
         * 判断101~200之间有多少个素数，并输出所有素数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.print("第一个数：");
                        int first = sc.nextInt();
                        System.out.print("第二个数：");
                        int second = sc.nextInt();
                        if (first < second)
                            {
                                extracted(first, second);
                                break;
                            }
                        else
                            {
                                System.out.println("输入的第一个数要大于第二个数，请重新输入！");
                            }
                    }
            }

        /**
         * 判断质数
         *
         * @param first
         * @param second
         */
        private static void extracted(int first, int second)
            {
                int count = 0;
                //判断当前数字是否为质数
                for (int i = first; i < second; i++)
                    {
                        boolean flag = true;
                        for (int j = 2; j < first; j++)
                            {
                                if (i % j == 0)
                                    {
                                        flag = false;
                                        //跳出单层循环，内循环
                                        break;
                                    }
                            }
                        if (flag)
                            {
                                count++;
                                System.out.print(i + " ");
                            }
                    }
                System.out.println();
                System.out.println(first + "与" + second + "之间共有" + count + "个素数");
            }

    }
