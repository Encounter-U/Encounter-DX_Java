package com.dongxin.day04.test;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class test14
    {
        /**
         * 求1~100之间的偶数和
         *
         * @param args
         */
        public static void main(String[] args)
            {
                /*int sum = 0;
                for (int i = 0; i <= 100; i += 2)
                    {
                        sum += i;
                    }
                System.out.println(sum);*/
                int sum = 0;
                for (int i = 1; i <= 100; i++)
                    {
                        if (i % 2 == 0)
                            {
                                sum += i;
                            }
                    }
                System.out.println(sum);
            }
    }
