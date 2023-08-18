package com.dongxin.day07.test1_0724;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/24
 */
public class Test1
    {
        /**
         * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
         * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
         * <p>
         * 补充快捷键：Ctrl+alt+M 快捷提取方法并生成
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                //无限循环，直至输入正确的月份
                while (true)
                    {
                        System.out.print("输入当前月份：");
                        int month = sc.nextInt();
                        if (month >= 1 && month <= 12)
                            {
                                System.out.print("输入机票原价：");
                                double money = sc.nextDouble();
                                System.out.print("输入机舱种类(0为头等舱，1为经济舱)：");
                                int type = sc.nextInt();
                                //根据淡季和旺季判断票价
                                if (month >= 5 && month <= 10)
                                    {
                                        //旺季
                                        money(money, type, 0.9, 0.85);
                                    }
                                else
                                    {
                                        //淡季
                                        money(money, type, 0.7, 0.65);
                                    }
                                break;
                            }
                        else
                            {
                                System.out.println("请输入正确的月份！");
                            }
                    }
            }

        /**
         * 根据舱类选择折扣方式并输出最终票价
         *
         * @param money
         * @param type
         * @param v0
         * @param v1
         */
        public static void money(double money, int type, double v0, double v1)
            {
                if (type == 0)
                    {
                        //头等舱
                        money = money * v0;
                        System.out.println("最终票价为：" + money);
                    }
                else if (type == 1)
                    {
                        //经济舱
                        money = money * v1;
                        System.out.println("最终票价为：" + money);
                    }
                else
                    {
                        System.out.println("请输入正确的舱位！");
                    }
            }
    }
