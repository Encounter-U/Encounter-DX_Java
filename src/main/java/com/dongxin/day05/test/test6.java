package com.dongxin.day05.test;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class test6
    {
        /**
         * 生成随机数
         * 生成1~100
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Random r = new Random();
                int i = r.nextInt(100)+1;//1~100
                System.out.println(i);
            }
    }
