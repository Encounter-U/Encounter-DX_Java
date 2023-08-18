package com.dongxin.day10.StringDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringDemo12
    {
        public static void main(String[] args)
            {
                String str = "你玩的真好，TMD,CNM ";
                //String newStr = str.replace("TMD", "***");
                //System.out.println(newStr);

                //定义一个敏感词库
                String[] arr = {"TMD", "SB", "CNM"};

                for (int i = 0; i < arr.length; i++)
                    {
                        str = str.replace(arr[i], "***");
                    }
                System.out.println(str);
            }
    }
