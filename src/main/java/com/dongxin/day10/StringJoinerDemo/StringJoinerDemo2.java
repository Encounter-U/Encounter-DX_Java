package com.dongxin.day10.StringJoinerDemo;

import java.util.StringJoiner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringJoinerDemo2
    {
        public static void main(String[] args)
            {
                StringJoiner sj = new StringJoiner(",", "[", "]");

                //添加元素
                sj.add("aa").add("bb").add("cc");
                System.out.println(sj);

                //间隔符号，前后缀以及空格都会计入
                System.out.println(sj.length());

                //转换为字符串
                String str = sj.toString();
                System.out.println(str);
            }
    }
