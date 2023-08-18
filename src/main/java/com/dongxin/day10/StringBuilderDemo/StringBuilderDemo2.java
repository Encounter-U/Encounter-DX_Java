package com.dongxin.day10.StringBuilderDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo2
    {
        public static void main(String[] args)
            {
                StringBuilder sb=new StringBuilder();
                //sb.append("aaa");
                //sb.append("bbb");
                //sb.append("ccc");
                //sb.append("ddd");
                //append方法返回的还是一个StringBuilder容器
                sb.append("aaa").append("bbb").append("ccc").append("ddd");
                System.out.println(sb);

                //再把StringBuilder变回字符串,才可用字符串的方法
                String str = sb.toString();
                System.out.println(str);
            }
    }
