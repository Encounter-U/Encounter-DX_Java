package com.dongxin.day07.day07_0803;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class TwoDimensionDemo2
    {
        /**
         * 二维数组的动态初始化
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //动态初始化创建二维数组
                int[][] arr=new int[3][5];
                //给二维数组赋值一个元素
                arr[0][0]=10;
                //遍历二维数组
                for (int i = 0; i < arr.length; i++)
                    {
                        for (int j = 0; j < arr[i].length; j++)
                            {
                                System.out.print(arr[i][j]+" ");
                            }
                        System.out.println();
                    }
            }
    }
