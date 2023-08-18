package com.dongxin.day04;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/7/21
 */
public class SwitchDemo1
    {
        public static void main(String[] args)
            {
                System.out.println("-------------------");
                System.out.println("1-兰州拉面");
                System.out.println("2-鱼香肉丝盖饭");
                System.out.println("3-15元自助小火锅");
                System.out.println("-------------------");
                System.out.println("想吃点啥，输入序号：");
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                switch (m)
                    {
                        case 1:
                            System.out.println("兰州拉面一份");
                            break;
                        case 2:
                            System.out.println("鱼香肉丝盖饭一份");
                            break;
                        case 3:
                            System.out.println("自助小火锅一位");
                            break;
                        default:
                            System.out.println("我们没有这道菜");
                            break;
                    }
            }
    }
