package com.dongxin.day10.StringBuilderDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo5
    {
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3};
                System.out.println(splicing(arr));
            }

        public static String splicing(int[] arr)
            {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int i = 0; i < arr.length; i++)
                    {
                        if (i == arr.length - 1)
                            sb.append(arr[i]);
                        else
                            sb.append(arr[i] + ",");
                    }
                sb.append("]");
                return sb.toString();
            }
    }
