package com.dongxin.day10.StringJoinerDemo;

import java.util.StringJoiner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringJoinerDemo1
    {
        public static void main(String[] args)
            {
                //创建一个对象，并指定中间的间隔符号
                StringJoiner sj=new StringJoiner("---");

                //添加元素，目前只能添加字符串
                sj.add("aaa").add("bbb").add("ccc");
                sj.add("ddd");
                System.out.println(sj);


            }
    }
