package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test1
    {
        public static void main(String[] args)
            {
                circumference(56,98);
            }
        public static void circumference(int length,int width)
            {
                int cir=(length+width)*2;
                System.out.println("该长方形的周长为："+cir);
            }
    }
