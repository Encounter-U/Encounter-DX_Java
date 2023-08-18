package com.dongxin.day03.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class test4
    {
        /**
         * 三元运算符练习1
         * 键入两只老虎体重，判断是否相等
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("第一只老虎：");
                int a = sc.nextInt();
                System.out.println("第二只老虎：");
                int b = sc.nextInt();
                String res = a == b ? "体重相同" : "体重不同";
                System.out.println(res);
            }
    }
