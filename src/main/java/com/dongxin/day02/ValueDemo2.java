package com.dongxin.day02;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class ValueDemo2
    {
        public static void main(String[] args)
            {
                /**
                 * \t 制表符
                 * 在打印时，把前面字符串的长度补齐到8，或者8的整数倍。最少补1个空格，最多补8个空格
                 */
                //正常样式
                System.out.println("name"+"age");
                System.out.println("DongXin"+"21");
                //添加制表符后
                System.out.println("name"+'\t'+"age");
                System.out.println("DongXin"+'\t'+"21");
            }
    }
