package com.dongxin.day04;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class SwitchDemo2
    {
        /**
         * case穿透
         * 语句中未写break导致
         * 执行流程：
         * 首先还是会拿着小括号内的值跟下面每一个case进行匹配
         * 如果匹配上了，就会执行对应的语句体，若此时发现了break，那么结束整个switch语句
         * 若没有发现break，那么程序会继续执行下一个case的语句体，一直遇到break或者右大括号为止
         * 使用场景：
         * 如果多个case的语句体重复了，那么我们考虑利用case穿透去简化代码
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入数字：");
                int num = sc.nextInt();
                switch (num)
                    {
                        case 1:
                            System.out.println("输入的是1");
                            break;
                        case 2:
                            System.out.println("输入的是2");
                            //break;
                        case 3:
                            System.out.println("输入的是3");
                            break;
                        default:
                            System.out.println("未储存该数字");
                            //break;
                    }
            }
    }
