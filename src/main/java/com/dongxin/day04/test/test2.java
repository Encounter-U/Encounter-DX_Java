package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test2
    {
        /**
         * 红绿灯模拟
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("-------------");
                System.out.println("1为红灯；");
                System.out.println("2为黄灯；");
                System.out.println("3为绿灯；");
                System.out.println("-------------");
                System.out.print("当前红绿灯状态：");
                int light = sc.nextInt();
                if (light == 1)
                    {
                        System.out.println("红灯亮，请停止");
                    }
                else if (light == 2)
                    {
                        System.out.println("黄灯亮，请减速");
                    }
                else if (light == 3)
                    {
                        System.out.println("绿灯亮，请行驶");
                    }
            }
    }
