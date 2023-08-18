package com.dongxin.day05.test;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test1
    {
        /**
         * 逢7过
         * 打印出1~100的数，跳过含7或者是7的倍数的数字
         *
         * @param args
         */
        public static void main(String[] args)
            {
                for (int i = 1; i <= 100; i++)
                    {
                        if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
                            {
                                continue;
                            }
                        System.out.println(i);
                    }
            }
    }
