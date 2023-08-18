package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test9
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("今天是周几：");
                int week = sc.nextInt();
                switch (week)
                    {
                        case 1:
                            System.out.println("周一该去跑步");
                            break;
                        case 2:
                            System.out.println("周二该去游泳");
                            break;
                        case 3:
                            System.out.println("周三该去慢走");
                            break;
                        case 4:
                            System.out.println("周四该去骑动感单车");
                            break;
                        case 5:
                            System.out.println("周五该去拳击");
                            break;
                        case 6:
                            System.out.println("周六该去爬山");
                            break;
                        case 7:
                            System.out.println("周日该去好好吃一顿");
                            break;
                        default:
                            System.out.println("你觉得你输入的合理吗？fw");
                            break;
                    }
            }
    }
