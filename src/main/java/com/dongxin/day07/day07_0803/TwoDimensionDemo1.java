package com.dongxin.day07.day07_0803;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class TwoDimensionDemo1
    {
        /**
         * 二维数组的静态初始化
         * 元素访问
         * 二维数组遍历
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //静态初始化
                int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8, 9}};
                int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}};
                //以后建议这样定义，把每一个一维数组单独写成一行
                int[][] arr3 = {
                        {1, 2, 3},
                        {4, 5, 6, 7, 8, 9}
                };

                //获取元素
                //System.out.println(arr3[0]);//[I@4eec7777 表示获取二维数组中的第一个数组
                System.out.println(arr3[0][0]);//获取第一个一维数组中0索引的元素

                //遍历二维数组
                for (int i = 0; i < arr3.length; i++)
                    {
                        for (int j = 0; j < arr3[i].length; j++)
                            {
                                System.out.print(arr3[i][j] + " ");
                            }
                        //此处加一个换行，每个一维数组打印一行
                        System.out.println();
                    }
            }
    }
