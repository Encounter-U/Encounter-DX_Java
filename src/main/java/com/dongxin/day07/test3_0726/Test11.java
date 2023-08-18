package com.dongxin.day07.test3_0726;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/26
 */
public class Test11
    {
        /**
         * 双色球彩票系统
         * 随机抽取六红一蓝 红球1~33 篮球1~16
         * 一等奖：1000w 6+1
         * 二等奖：500w  6+0
         * 三等奖：3000  5+1
         * 四等奖：200   5+0 4+1
         * 五等奖：10    4+0 3+1
         * 六等奖：5     2+1 1+1 0+1
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //奖池
                int[] award = awardNumber();
                //开始选号
                int[] redNum = redNum();//红球
                int blueNum = blueNum();//蓝球
                int red = 0;
                //统计中奖红球个数
                System.out.print("中奖红球为：");
                for (int i = 0; i < redNum.length; i++)
                    {
                        boolean flag = false;
                        for (int j = 0; j < award.length - 1; j++)
                            {
                                if (redNum[i] == award[j])
                                    {
                                        flag = true;
                                    }
                            }
                        if (flag)
                            {
                                //输出中奖红球
                                System.out.print(redNum[i] + " ");
                                red++;
                            }
                    }
                if(red!=0)
                    {
                        System.out.println("共有" + red + "个红球中奖");
                    }
                //统计蓝球中奖个数
                int blue = 0;
                if (blueNum == award[6])
                    {
                        blue = 1;
                        System.out.println("蓝球中奖");
                    }
                else
                    {
                        System.out.println("蓝球未中奖");
                    }
                //发布奖池
                System.out.print("中奖号码为（前六位为红球，第七位为蓝球）：");
                for (int i = 0; i < award.length; i++)
                    {
                        System.out.print(award[i] + " ");
                    }
                System.out.println();
                //定义中奖代码
                String awardNum = red + "+" + blue;
                System.out.println("您的中奖号码为："+awardNum);
                switch (awardNum)
                    {
                        case "6+1" -> System.out.println("恭喜中得一等奖1000w元");
                        case "6+0" -> System.out.println("恭喜中得二等奖500w元");
                        case "5+1" -> System.out.println("恭喜中得三等奖3000元");
                        case "5+0", "4+1" -> System.out.println("恭喜中得四等奖200元");
                        case "4+0", "3+1" -> System.out.println("恭喜中得五等奖10元");
                        case "2+1", "1+1", "0+1" -> System.out.println("恭喜中得六等奖5元");
                        default -> System.out.println("傻鸟，老黑，一分钱你都没中，666");
                    }
            }

        /**
         * 抽蓝球
         *
         * @return
         */
        public static int blueNum()
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.print("请抽取您的蓝球号码：");
                        int blueNum = sc.nextInt();
                        if (blueNum >= 1 && blueNum <= 16)
                            {
                                return blueNum;
                            }
                    }
            }

        /**
         * 抽红球并把号码存入一个数组内
         *
         * @return
         */
        private static int[] redNum()
            {
                Scanner sc = new Scanner(System.in);
                int[] redNum = new int[6];
                for (int i = 0; i < 6; )
                    {
                        System.out.print("请选择您的第" + (i + 1) + "个红球号码：");
                        int num = sc.nextInt();
                        boolean flag = true;
                        for (int j = 0; j < redNum.length; j++)
                            {
                                if (num == redNum[j])
                                    {
                                        flag = false;
                                    }
                            }
                        if (flag && (num >= 1 && num <= 33))
                            {
                                redNum[i] = num;
                                i++;
                            }
                        else
                            {
                                System.out.println("您选择的号码有重复或超出大小范围，请重新选择");
                            }
                    }
                return redNum;
            }

        /**
         * 定义奖池
         */
        public static int[] awardNumber()
            {
                Random r = new Random();
                int blue = r.nextInt(16) + 1;
                //该数组用来存储中奖号码
                int[] award = new int[7];
                award[6] = blue;
                //该数组用来放所有红色球
                int[] red = new int[33];
                for (int i = 0; i < red.length; i++)
                    {
                        red[i] = i + 1;
                        //System.out.print(red[i] + " ");
                    }
                int temp = 0;
                for (int i = 0; i < award.length; i++)
                    {
                        int randomIndex = r.nextInt(red.length - i);
                        //System.out.println(randomIndex);
                        temp = red[randomIndex];
                        red[randomIndex] = red[red.length - i - 1];
                        red[red.length - i - 1] = temp;
                        award[i] = temp;
                    }
                //查看奖池
                /*for (int i = 0; i < award.length; i++)
                    {
                        System.out.print(award[i] + " ");
                    }
                System.out.println();*/
                return award;
            }
    }
