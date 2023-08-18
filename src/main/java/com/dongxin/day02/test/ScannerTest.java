package com.dongxin.day02.test;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class ScannerTest
    {
        public static void main(String[] args)
            {
                //创建对象
                Scanner sc = new Scanner(System.in);
                //提示
                System.out.println("请输入第一个整数i:");
                //接收数据
                int i = sc.nextInt();
                //第二个数据
                System.out.println("请输入第二个整数m:");
                int m = sc.nextInt();
                //计算二者之和
                System.out.println("i + m = " + (i + m));
            }
    }
