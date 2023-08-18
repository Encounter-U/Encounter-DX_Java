package com.dongxin.day10.Test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test2Case2
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入第一个字符串：");
                String a = sc.next();
                System.out.print("输入第二个字符串：");
                String b = sc.next();
                boolean flag = false;
                for (int i = 0; i < a.length(); i++)
                    {
                        a = adjust(a);
                        //System.out.println(a);
                        if (checkSame(a, b))
                            {
                                flag = true;
                                break;
                            }
                    }
                if (flag)
                    System.out.println(true);
                else
                    System.out.println(false);
            }

        /**
         * 判断两个字符串是否相等
         *
         * @param a
         * @param b
         * @return
         */
        public static boolean checkSame(String a, String b)
            {
                if (a.equals(b))
                    return true;
                else
                    return false;
            }

        /**
         * 将字符串调位
         *
         * @param str
         * @return
         */
        public static String adjust(String str)
            {
                //把字符串转换为数组
                /*char[] chs = new char[str.length()];
                for (int i = 0; i < str.length(); i++)
                    {
                        chs[i] = str.charAt(i);
                    }*/
                //以上等同于：
                char[] chs=str.toCharArray();
                //将数组中元素调位
                char temp = chs[0];
                for (int i = 0; i < chs.length; i++)
                    {
                        if (i == chs.length - 1)
                            chs[i] = temp;
                        else
                            chs[i] = chs[i + 1];
                    }
                //把数组转为字符串并返回
                /*StringBuilder sb = new StringBuilder();
                for (int i = 0; i < chs.length; i++)
                    {
                        sb.append(chs[i]);
                    }
                return sb.toString();*/
                //简化以上步骤
                return new String(chs);
            }
    }
