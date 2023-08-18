package com.dongxin.day03.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class test3
    {
        /**
         * 斯坦福大学Java入门练习
         * 数字6是一个真正伟大的数字，键盘录入两个整数如果其中一个为 6，最终结果输出true。
         * 如果它们的和为 6的倍数。最终结果输出true。其他情况都是false。
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入第一个整数：");
                int first = sc.nextInt();
                System.out.println("请输入第二个整数：");
                int second = sc.nextInt();
                boolean re = first == 6 || second == 6 || (first + second) % 6 == 0;
                System.out.println("最终结果为：" + re);
            }
    }
