package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test3
    {
        /**
         * 比较两长方形周长
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //compareSizes(area(15,14),area(13,16));
                double a1 = area(15, 14);
                double a2 = area(13, 16);
                System.out.println(a1 + " " + a2);
                compareSizes(a1, a2);
            }

        /**
         * 计算长方形面积
         *
         * @param length
         * @param width
         * @return
         */
        public static double area(double length, double width)
            {
                double result = length * width;
                return result;
            }

        /**
         * 比较大小
         *
         * @param a1
         * @param a2
         */
        public static void compareSizes(double a1, double a2)
            {
                if (a1 > a2)
                    {
                        System.out.println("前者较大");
                    }
                else if (a1 < a2)
                    {
                        System.out.println("后者较大");
                    }
                else
                    {
                        System.out.println("二者一样大");
                    }
            }
    }
