package com.dongxin.day07.day07_0803;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class TwoDimensionDemo3
    {
        /**
         * 某商城每个季度的营业额如下：单位（万元）
         * 第一季度：22，66，44
         * 第二季度：77，33，88
         * 第三季度：25，45，65
         * 第四季度：11，66，99
         * 计算出每个季度的总营业额和全年的总营业额
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //输入并储存每个季度的营业额
                int[][] quarter = quarter();
                /*for (int i = 0; i < quarter.length; i++)
                    {
                        for (int j = 0; j < quarter[i].length; j++)
                            {
                                System.out.print(quarter[i][j]+" ");
                            }
                    }*/
                //计算每个季度的总营业额
                int sumAll = 0;
                for (int i = 0; i < quarter.length; i++)
                    {
                        int sum = 0;
                        for (int j = 0; j < quarter[i].length; j++)
                            {
                                sum += quarter[i][j];
                            }
                        System.out.println("第" + (i + 1) + "季度的总营业额为：" + sum);
                        sumAll += sum;
                    }
                //计算全年的营业额
                System.out.println("全年的总营业额为：" + sumAll);

            }

        public static int[][] quarter()
            {
                int[][] arr = new int[4][3];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 4; i++)
                    {
                        System.out.println("第" + (i + 1) + "季度：");
                        for (int j = 0; j < 3; j++)
                            {
                                System.out.print("  本季度第" + (j + 1) + "月的营业额为：");
                                arr[i][j] = sc.nextInt();
                            }
                    }
                return arr;
            }
    }
