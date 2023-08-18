package com.dongxin.day10.StringBuilderDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo1
    {
        public static void main(String[] args)
            {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder("煞笔");

                //添加元素
                sb.append(1);
                sb.append(2.3);
                sb.append(true);

                //反转
                sb.reverse();

                //获取长度
                int length = sb.length();
                System.out.println(length);

                /**
                 * 打印：
                 * 因为StringBuilder是Java已经写好的类
                 * Java在底层对他做了一些特殊处理
                 * 打印对象不是地址值而是属性值
                 */
                System.out.println(sb);
                System.out.println(sb1);
            }
    }
