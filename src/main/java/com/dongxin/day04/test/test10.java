package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test10
    {
        /**
         * case穿透实例演示
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("输入一个整数表示星期几：");
                int week = sc.nextInt();
                /*switch (week)
                    {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("工作日");
                            break;
                        case 6:
                        case 7:
                            System.out.println("休息日");
                            break;
                        default:
                            System.out.println("输入有误");
                            break;
                    }*/
                /**
                 * 利用新特性
                 */
                switch (week)
                    {
                        case 1, 2, 3, 4, 5 -> System.out.println("工作日");
                        case 6, 7 -> System.out.println("休息日");
                        default -> System.out.println("输入有误");
                    }
            }
    }
