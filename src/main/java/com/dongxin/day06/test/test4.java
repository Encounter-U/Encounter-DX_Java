package com.dongxin.day06.test;

/**
 * @author Encounter
 * @date 2023/7/23
 */
public class test4
    {
        /**
         * 使用方法重载，比较两数是否相同
         * 要求：兼容全整数类型（byte,short,int,long）
         *
         * @param args
         */
        public static void main(String[] args)
            {
                compare((byte) 56, (byte) 98);//强行转换
                compare((short) 2, (short) 6);
                compare(56, 54);
                compare(8564L, 59651L);
            }

        public static void compare(byte b1, byte b2)
            {
                System.out.print("byte:");
                if (b1 == b2)
                    {
                        System.out.println("两数相同");
                    }
                else
                    {
                        System.out.println("两数不同");
                    }
            }

        public static void compare(short s1, short s2)
            {
                System.out.print("short:");
                if (s1 == s2)
                    {
                        System.out.println("两数相同");
                    }
                else
                    {
                        System.out.println("两数不同");
                    }
            }

        public static void compare(int i1, int i2)
            {
                System.out.print("int:");
                if (i1 == i2)
                    {
                        System.out.println("两数相同");
                    }
                else
                    {
                        System.out.println("两数不同");
                    }
            }

        public static void compare(long l1, long l2)
            {
                System.out.print("long:");
                if (l1 == l2)
                    {
                        System.out.println("两数相同");
                    }
                else
                    {
                        System.out.println("两数不同");
                    }
            }
    }
