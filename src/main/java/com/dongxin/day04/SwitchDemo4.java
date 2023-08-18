package com.dongxin.day04;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class SwitchDemo4
    {
        /**
         * switch与if的第三种格式各自的使用场景
         * if：一般用于对范围的判断
         * switch：把有限个数据一一列举出来，让我们任选其一
         *
         * @param args
         */
        public static void main(String[] args)
            {
                /**
                 * if见test6
                 */
                /**
                 * switch
                 */
                Scanner sc = new Scanner(System.in);
                System.out.print("输入数字：");
                int num = sc.nextInt();
                switch (num)
                    {
                        case 1 -> System.out.println("输入的是1");
                        case 2 -> System.out.println("输入的是2");
                        case 3 -> System.out.println("输入的是3");
                        default -> System.out.println("未储存该数字");
                    }
            }
    }
