package com.dongxin.day02;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class ScannerDemo1
    {
        public static void main(String[] args)
            {
                //创建对象
                Scanner sc = new Scanner(System.in);
                //提示
                System.out.println("请输入整数：");
                //接收数据
                //变量i记录了键盘录入的数据
                int i = sc.nextInt();
                //打印出i记录的数据
                System.out.println("您输入的是："+i);
            }
    }
