package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayDemo3
    {
        /**
         * 遍历数组元素
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr={1,2,3,4,5,6};
                /*for (int i = 0; i <= 5; i++)
                    {
                        System.out.println(arr[i]);
                    }*/
                /**
                 * Java中关于数组的一个长度属性：length
                 * 调用方式：数组名.length
                 */
                for (int i = 0; i < arr.length; i++)
                    {
                        System.out.println(arr[i]);
                    }
            }
    }
