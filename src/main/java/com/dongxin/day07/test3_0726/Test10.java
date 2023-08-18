package com.dongxin.day07.test3_0726;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/26
 */
public class Test10
    {
        /**
         * 抽奖系统
         *
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr = {2, 588, 888, 1000, 10000};
                Random r = new Random();
                int temp = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        int randomIndex = r.nextInt(arr.length);
                        temp = arr[i];
                        arr[i] = arr[randomIndex];
                        arr[randomIndex] = temp;
                    }
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
            }
    }
