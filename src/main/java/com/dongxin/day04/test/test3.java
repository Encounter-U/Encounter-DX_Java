package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test3
    {
        /**
         * 看看身上有多少钱，吃啥饭
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("当前身上有多少钱：");
                int money = sc.nextInt();
                if (money >= 100)
                    {
                        System.out.println("奢侈一把，去网红餐厅");
                    }
                else
                    {
                        System.out.println("艹了，没钱，回家吃泡面");
                    }
            }
    }
