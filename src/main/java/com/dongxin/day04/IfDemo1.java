package com.dongxin.day04;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class IfDemo1
    {
        /**
         * 键盘录入小伙子的酒量并判断是否大于2
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //键盘录入
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入小伙子的酒量");
                int wine = sc.nextInt();
                //对酒量进行判断
                if (wine > 2)
                    {
                        System.out.println("小伙子还行");
                    }
                else
                    {
                        System.out.println("小朋友，还得练");
                    }
            }
    }
