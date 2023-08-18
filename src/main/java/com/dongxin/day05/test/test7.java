package com.dongxin.day05.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test7
    {
        /**
         * 随机生成一个数字，使用程序猜这个数字
         *
         * @param args
         */
        public static void main(String[] args)
            {
                /**
                 * 生成随机数,0~100
                 * 这串带代码不能写在循环中
                 */
                Random r = new Random();
                int num = r.nextInt(100);
                /**
                 * 键盘录入，创建对象
                 */
                Scanner sc = new Scanner(System.in);
                /**
                 * 看你一直猜不中，不忍心，所以给你加个保底机制，五次必中
                 */
                int count = 0;
                /**
                 * 使用一个无限循环不断重复，直到猜出来时跳出循环
                 */
                while (true)
                    {
                        /**
                         * 键盘录入
                         */
                        System.out.println("请输入一个0~100的整数：");
                        int guessnum = sc.nextInt();
                        /**
                         * 此处加上保底机制，触发之后下面的代码不再执行
                         */
                        count++;
                        if (count == 5)
                            {
                                System.out.println("你个傻鸟，又吃保底了吧，行了，别猜了，算你猜中了");
                                break;
                            }
                        /**
                         * 判断猜的数字与实际生成的数字的大小关系
                         */
                        if (guessnum > num)
                            {
                                System.out.println("大了，再来一次");
                            }
                        else if (guessnum < num)
                            {
                                System.out.println("小了，再来一次");
                            }
                        else
                            {
                                System.out.println("nnd，你终于猜对了");
                                break;
                            }
                    }
            }
    }
