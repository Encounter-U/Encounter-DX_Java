package com.dongxin.day10.StringDemo;

/**
 * @author Encounter
 * @date 2023/8/14
 */
public class StringDemo7
    {
        public static void main(String[] args)
            {
                int[] arr = {1, 2, 3, 4, 6};
                String str = method(arr);
                System.out.println(str);
            }

        public static String method(int[] arr)
            {
                if (arr == null)
                    {
                        return "";
                    }
                else if (arr.length == 0)
                    {
                        return "[]";
                    }
                else
                    {
                        String s = "[";
                        for (int i = 0; i < arr.length; i++)
                            {
                                if (i == arr.length - 1)
                                    {
                                        s = s + arr[i] + "]";
                                    }
                                else
                                    {
                                        s = s + arr[i] + ",";
                                    }
                            }
                        return s;
                    }
            }
    }
