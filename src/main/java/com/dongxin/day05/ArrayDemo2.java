package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayDemo2
    {
        public static void main(String[] args)
            {
                //定义数组
                int[] arr = {1, 2, 3, 4, 5};
                /**
                 * 利用索引对数组中数据进行访问，从0开始
                 */
                int num = arr[0];
                System.out.println(num);
                System.out.println(arr[2]);

                /**
                 * 把数据存入数组
                 * 数组名[索引]=具体数据/变量
                 * 一旦覆盖之后，原数据就不存在了
                 */
                //将100赋值给第一个元素
                arr[0] = 100;
                System.out.println(arr[0]);
            }
    }
