package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test4
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("实际支付的钱：");
                int money = sc.nextInt();
                if (money >= 600)
                    {
                        System.out.println("付款成功");
                    }
                else
                    {
                        System.out.println("付款失败");
                    }
            }
    }
