package com.dongxin.day04;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class SwitchDemo3
    {
        /**
         * switch在JDK12之后推出的新特性
         * 单行代码可省略大括号
         *
         * @param args
         */
        public static void main(String[] args)
            {
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
