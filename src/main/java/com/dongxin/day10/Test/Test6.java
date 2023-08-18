package com.dongxin.day10.Test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test6
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("输入一个字符串：");
                String str = sc.nextLine();
                System.out.println("长度为：" + word(str));
            }

        public static int word(String str)
            {
                StringBuilder sb = new StringBuilder();
                char[] chs = str.toCharArray();
                int length = 0;
                for (int i = chs.length - 1; i >= 0; i--)
                    {
                        if (chs[i] == ' ')
                            break;
                        length++;
                        sb.append(chs[i]);
                    }
                System.out.println("最后一个单词为：" + sb.reverse());
                return length;
            }
    }
