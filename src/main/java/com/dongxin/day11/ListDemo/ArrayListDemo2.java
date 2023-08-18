package com.dongxin.day11.ListDemo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class ArrayListDemo2
    {
        public static void main(String[] args)
            {
                //创建集合
                ArrayList<String> list = new ArrayList<>();

                //添加元素
                //不论添加什么类型的都可以添加成功，所以一般不管其返回值
                boolean result = list.add("aaa");
                list.add("eee");
                list.add("bbb");
                list.add("ccc");
                //System.out.println(result);
                //System.out.println(list);

                //删除元素
                /*boolean rs1 = list.remove("aaa");
                System.out.println(rs1);
                boolean rs2 = list.remove("ddd");
                System.out.println(rs2);

                String str = list.remove(2);
                System.out.println(str);
                System.out.println(list);*/

                //修改元素
                /*String rs = list.set(1, "ddd");
                System.out.println(rs);

                System.out.println(list);*/

                //查询元素
                /*String s = list.get(0);
                System.out.println(s);

                System.out.println(list);*/

                //遍历
                for (int i = 0; i < list.size(); i++)
                    {
                        String s = list.get(i);
                        System.out.print(s+" ");
                    }
            }
    }
