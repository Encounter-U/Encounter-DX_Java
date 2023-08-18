package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test2
    {
        /**
         * 带参
         *
         * @param args
         */
        public static void main(String[] args)
            {
                area(3.14);
            }

        public static void area(double radius)
            {
                double area = radius * radius * 3.14;
                System.out.println("该圆的面积为：" + area);
            }
    }
