package com.dongxin.day07.test2_0725;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test9
    {
        /**
         * 一个大v直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金
         * 使用代码模拟抽奖，打印出每个奖项，奖项出现的顺序要随机且不重复
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //定义数组存储奖池
                int[] arr = {2, 588, 888, 1000, 10000};
                int[] newArr = new int[arr.length];
                for (int i = 0; i < arr.length; i++)
                    {
                        int[] arr2=new int[arr.length-i];
                        for (int j = 0; j < arr.length-i; j++)
                            {
                                arr2[j]=arr[j];
                            }
                        int bonus = extracted(arr2);
                        newArr[i]=bonus;
                        int temp=0;
                        for (int j = 0; j < arr.length-i; j++)
                            {
                                if (bonus == arr[j])
                                    {
                                        temp=arr[j];
                                        arr[j]=arr[arr.length-1-i];
                                        arr[arr.length-1-i]=temp;
                                    }
                            }
                    }
                for (int i = 0; i < newArr.length; i++)
                    {
                        System.out.print(newArr[i]+" ");
                    }
            }

        /**
         * 抽奖
         *
         * @param arr
         */
        private static int extracted(int[] arr)
            {
                //随机索引拿出一个奖
                Random r = new Random();
                int randomIndex = r.nextInt(arr.length);
                return arr[randomIndex];
            }
    }
