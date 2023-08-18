package com.dongxin.day10.Test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test5
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入第一个非负整数（字符串型）：");
                String num1 = sc.next();
                System.out.print("输入第二个非负整数（字符串型）：");
                String num2 = sc.next();
                if (checkNum(num1) && checkNum(num2))
                    System.out.println(product(num1, num2));
                else
                    System.out.println("输入的数据有误！");
            }

        /**
         * 判断字符串是否全为数字
         *
         * @param str
         * @return
         */
        public static boolean checkNum(String str)
            {
                char[] chs = str.toCharArray();
                boolean flag = true;
                for (int i = 0; i < chs.length; i++)
                    {
                        if (chs[i] < 48 || chs[i] > 57)
                            flag = false;
                    }
                return flag;
            }

        /**
         * 把字符串转换为数字
         *
         * @param str
         * @return
         */
        public static int conversion(String str)
            {
                /*char[] chs = str.toCharArray();
                int num = 0;
                for (int i = 0; i < chs.length; i++)
                    num = num * 10 + chs[i] - 48;*/
                int num = 0;
                for (int i = 0; i < str.length(); i++)
                    {
                        num = num * 10 + (str.charAt(i) - 48);
                    }
                return num;
            }

        /**
         * 将两个字符串转换后的乘积转换为字符串并返回
         *
         * @param num1
         * @param num2
         * @return
         */
        public static String product(String num1, String num2)
            {
                String result = "" + conversion(num1) * conversion(num2);
                return result;
            }
    }
