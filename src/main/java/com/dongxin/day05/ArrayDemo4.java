package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayDemo4
    {
        /**
         * 定义一个数组，用来存储50个学生的姓名
         * 姓名未知，等学生报道以后再进行添加
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //自己定义数组长度，由虚拟机给出默认的初始化值
                String[] arr=new String[50];//长度为50
                //添加学生
                arr[0]="路明非";
                arr[1]="上杉绘梨衣";
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                System.out.println(arr[2]);//未存入数据，默认为null

                /**
                 * 数组默认初化值的规律
                 * 整数类型：默认初始化值为0
                 * 小数类型：默认初始化值为0.0
                 * 字符类型：默认初始化值为'/u0000' (就是空格)
                 * 布尔类型：默认初始化值为false
                 * 引用数据类型：默认初始化值为null
                 */
                int[] arr2=new int[3];
                System.out.println(arr2[1]);
            }
    }
