package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test7
    {
        /**
         * 斯坦福大学Java入门练习
         * 商场都有VIP的会员制，根据不同的会员会有不同的折扣
         * 假设商品总价为1000
         * 键盘录入会员级别，并计算出实际支付的钱
         * 会员1级：打9折
         * 会员2级：打8折
         * 会员3级：打7折
         * 非会员：不打折，要打也是打骨折
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入你的会员级别：");
                int lv = sc.nextInt();
                if (lv == 1)
                    {
                        System.out.println("尊贵的" + lv + "级会员您共需支付：" + (1000 * 0.9) + "元");
                    }
                else if (lv == 2)
                    {
                        System.out.println("尊贵的" + lv + "级会员您共需支付：" + (1000 * 0.8) + "元");
                    }
                else if (lv == 3)
                    {
                        System.out.println("尊贵的" + lv + "级会员您共需支付：" + (1000 * 0.7) + "元");
                    }
                else
                    {
                        System.out.println("你nnd，你都不是会员还想白嫖？");
                    }
            }
    }
