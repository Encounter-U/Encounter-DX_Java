package com.dongxin.day03.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class test2
    {
        /**
         * 斯坦福大学Java入门练习:
         * 您和您的约会对象在餐厅里面正在约会。
         * 键盘录入两个整数，表示你和你约会对象衣服的时髻度。 (手动录入0~10之间的整数，不能录其他)
         * 如果你的时髻程度大于你对象的时髻程度，相亲就成功，输出true。否则输出false。
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入自己的时髦程度：");
                int i = sc.nextInt();
                if (i >= 0 && i <= 10)
                    {
                        System.out.println("请输入对方的时髦程度：");
                        int s = sc.nextInt();
                        if (s >= 0 && s <= 10)
                            {
                                System.out.println(i > s);
                            }
                        else
                            {
                                System.out.println("对方太时髦了，有点牛逼，换个垃圾点的");
                            }
                    }
                else
                    {
                        System.out.println("稍微低调点，换个数");
                    }
            }
    }
