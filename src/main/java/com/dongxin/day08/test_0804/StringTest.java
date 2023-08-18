package com.dongxin.day08.test_0804;

/**
 * @author Encounter
 * @date 2023/8/4
 */
public class StringTest
    {
        public static void main(String[] args)
            {
                String e = "encounter";

                //字符串长度
                int len = e.length();
                System.out.println(len);

                //改为大写
                String s = e.toUpperCase();
                System.out.println(s);
            }
    }
