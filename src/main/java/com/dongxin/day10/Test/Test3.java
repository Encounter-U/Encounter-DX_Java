package com.dongxin.day10.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test3
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入一个字符串：");
                String str = sc.next();
                System.out.println(strike(str));
            }

        public static String strike(String str)
            {
                Random r = new Random();
                char[] chs = str.toCharArray();
                for (int i = 0; i < chs.length; i++)
                    {
                        while (true)
                            {
                                int index = r.nextInt(chs.length);
                                if (index != i)
                                    {
                                        char temp = chs[i];
                                        chs[i] = chs[index];
                                        chs[index] = temp;
                                        break;
                                    }
                            }
                    }
                return new String(chs);
            }
    }
