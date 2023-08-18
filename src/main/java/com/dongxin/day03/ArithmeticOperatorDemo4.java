package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class ArithmeticOperatorDemo4
    {
        public static void main(String[] args)
            {
                /**
                 * 字符加数字或字符加字符时会先根据ASCII码表查询到对应数字再进行计算
                 */
                char c='a';
                System.out.println(c+0);
                /**
                 * 当有字符串参与计算时，变为拼接操作
                 */
                System.out.println(1+'a');
                System.out.println('a'+"a");
                System.out.println('a'+"abc");
            }
    }
