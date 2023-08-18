package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test11
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入按下的数字：");
                int num = sc.nextInt();
                switch (num)
                    {
                        case 1 -> System.out.println("机票查询");
                        case 2 -> System.out.println("机票预定");
                        case 3 -> System.out.println("机票改签");
                        default -> System.out.println("退出服务");
                    }
            }
    }
