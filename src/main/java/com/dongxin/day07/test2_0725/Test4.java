package com.dongxin.day07.test2_0725;

/**
 * @author Encounter
 * @date 2023/7/25
 */
public class Test4
    {
        /**
         * 把数组中的元素复制到另一个新数组中去
         * @param args
         */
        public static void main(String[] args)
            {
                int[] arr={1,2,3,4,5};
                int[] arr2=new int[arr.length];
                for (int i = 0; i < arr.length; i++)
                    {
                        arr2[i]=arr[i];
                    }
                for (int i = 0; i < arr2.length; i++)
                    {
                        System.out.print(arr2[i]+" ");
                    }
            }
    }
