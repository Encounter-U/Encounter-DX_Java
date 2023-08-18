package com.dongxin.day07.test2_0725;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test5
    {
        /**
         * 在和歌唱比赛中，有6名评委给选手打分，分数是[0~100]之间的整数
         * 选手最后得分为：去掉最高分、最低分后的4个评委的平均分
         * 完成上述过程并计算出选手的得分
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //键盘录入6位评委的打分并存入数组
                int[] arr = new int[6];
                Scanner sc = new Scanner(System.in);
                for (int i = 1; i < 7; i++)
                    {
                        while (true)
                            {
                                System.out.print("请第" + i + "位评委打分:");
                                int fraction = sc.nextInt();
                                if (fraction >= 0 && fraction <= 100)
                                    {
                                        arr[i - 1] = fraction;
                                        break;
                                    }
                                else
                                    {
                                        System.out.println("您打的分数有误，请重新打分！");
                                    }
                            }
                    }
                //记录最大值
                int max = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] > max)
                            {
                                max = arr[i];
                            }
                    }
                //记录最小值
                int min = arr[0];
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] < min)
                            {
                                min = arr[i];
                            }
                    }
                //System.out.println(min+" "+max);
                //把要删除的评分重新赋值为0，并在一次赋值完成之后就停止循环
                extracted(arr, max);
                extracted(arr, min);
                /*for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i]+" ");
                    }*/
                //计算平均值
                int sum = 0;
                int count = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        sum += arr[i];
                        count++;
                        if (count == 6)
                            {
                                //此处注意数据能不写死就绝不写死
                                sum = sum / (arr.length-2);
                            }
                    }
                System.out.println("去掉一个最高分" + max + "和一个最低分" + min + "之后，最终成绩为" + sum);
            }

        public static void extracted(int[] arr, int delete)
            {
                for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] == delete)
                            {
                                arr[i] = 0;
                                break;
                            }
                    }
            }
    }
