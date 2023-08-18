package com.dongxin.day04.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test6
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入你的成绩：");
                int grade = sc.nextInt();
                if (grade > 0 && grade <= 100)
                    {
                        if (grade >= 95 && grade <= 100)
                            {
                                System.out.println("送你一辆自行车");
                            }
                        else if (grade >= 90 && grade <= 94)
                            {
                                System.out.println("去游乐场玩");
                            }
                        else if (grade >= 80 && grade <= 89)
                            {
                                System.out.println("送你个大黄蜂");
                            }
                        else
                            {
                                System.out.println("等死吧你，考这点b分");
                            }
                    }
                else
                    {
                        System.out.println("你觉得这个分合理吗？");
                    }
            }
    }
