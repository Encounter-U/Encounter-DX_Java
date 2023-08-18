package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test5
    {
        /**
         * 斯坦福大学Java入门练习
         * 假设某影院售卖了100张票，票的序号为1~100
         * 其中奇数票坐左侧，偶数票坐右侧
         * 键盘录入一个整数表示电影票的票号
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入你的票号：");
                int num = sc.nextInt();
                if (num >= 1 && num <= 100)
                    {
                        if (num % 2 == 0)
                            {
                                System.out.println("你去坐右边");
                            }
                        else
                            {
                                System.out.println("你去坐左边");
                            }
                    }
                else
                    {
                        System.out.println("你输入的票号有误");
                    }
            }
    }
