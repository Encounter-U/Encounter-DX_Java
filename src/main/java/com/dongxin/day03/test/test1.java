package com.dongxin.day03.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class test1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个三位整数：");
                int i = sc.nextInt();
                System.out.println("个位：" + i % 10);
                System.out.println("十位：" + i / 10 % 10);
                System.out.println("百位：" + i / 100 % 10);
            }
    }
