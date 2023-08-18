package com.dongxin.day10.Test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test2Case1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入第一个字符串：");
                String a = sc.next();
                System.out.print("输入第二个字符串：");
                String b = sc.next();
                boolean flag = false;
                for (int i = 0; i < a.length(); i++)
                    {
                        a = a.substring(1) + a.charAt(0);
                        if (a.equals(b))
                            {
                                flag = true;
                                break;
                            }
                    }
                if (flag)
                    System.out.println("true");
                else
                    System.out.println("false");
            }
    }
