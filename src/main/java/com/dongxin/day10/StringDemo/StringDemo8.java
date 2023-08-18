package com.dongxin.day10.StringDemo;

/**
 * @author Encounter
 * @date 2023/8/14
 */
public class StringDemo8
    {
        public static void main(String[] args)
            {
                String s = "Encounter";
                String newStr = rollback(s);
                System.out.println(newStr);
            }

        public static String rollback(String str)
            {
                char[] arr = new char[str.length()];
                for (int i = 0; i < str.length(); i++)
                    {
                        arr[arr.length-i-1] = str.charAt(i);
                    }
                String newStr = new String(arr);
                return newStr;
            }
    }
