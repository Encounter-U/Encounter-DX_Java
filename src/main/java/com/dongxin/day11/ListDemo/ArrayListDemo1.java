package com.dongxin.day11.ListDemo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class ArrayListDemo1
    {
        public static void main(String[] args)
            {
                //创建集合对象
                //泛型：限定集合中存储数据的类型
                //ArrayList<String> list = new ArrayList<String>();
                //JDK7:

                /**
                 * 此时创建的是ArrayList对象，而ArrayList是Java已经写好的类
                 * 这个类在底层做了一些处理
                 * 打印对象不是地址值，而是集合中存储数据内容
                 * 在展示的时候会拿[]把所有的数据进行包裹
                 */
                ArrayList<String> list=new ArrayList<>();
                System.out.println(list);
            }
    }
