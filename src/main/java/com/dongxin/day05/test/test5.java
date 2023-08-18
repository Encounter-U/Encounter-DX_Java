package com.dongxin.day05.test;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test5
    {
        /**
         * 生成随机数
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Random r = new Random();
                /**
                 * 生成随机数，
                 * 在小括号内写的是生成随机数的范围
                 * 这个范围一定是从0开始的
                 * 到这个数-1结束
                 * 口诀：包头不包尾，包左不包右
                 */
                int i = r.nextInt(100);//0~99

                System.out.println(i);
            }
    }
