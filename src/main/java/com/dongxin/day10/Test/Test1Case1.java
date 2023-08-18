package com.dongxin.day10.Test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test1Case1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个长度小于等于9的纯数字字符串：");
                String str = sc.next();
                if (str.length() <= 9 && judgement(str))
                    {
                        System.out.println(conversion(str));
                    }
                else
                    {
                        System.out.println("您输入的内容有误！");
                    }
            }

        /**
         * 判断字符串全部由数字组成
         *
         * @param str
         * @return
         */
        public static boolean judgement(String str)
            {
                for (int i = 0; i < str.length(); i++)
                    {
                        if (str.charAt(i) < 48 || str.charAt(i) > 57)
                            {
                                System.out.println(str.charAt(i));
                                return false;
                            }
                    }
                return true;
            }

        /**
         * 把数字转换为罗马数字
         *
         * @param str
         */
        public static String conversion(String str)
            {
                String[] romanNumPools = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++)
                    {
                        char c = str.charAt(i);
                        sb.append(romanNumPools[c - 48]);
                    }
                return sb.toString();
            }
    }
