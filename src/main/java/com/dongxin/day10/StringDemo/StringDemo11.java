package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringDemo11
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入身份证号：");
                String idNum = sc.next();
                String year = idNum.substring(6, 10);//年
                String month = idNum.substring(10, 12);//月
                String date = idNum.substring(12, 14);//日
                char gender = idNum.charAt(16);//性别
                System.out.println("人物信息为：");
                System.out.println("出生日期：" + year + "年" + month + "月" + date + "日");
                if ((gender - 48) % 2 == 0)
                    {
                        System.out.println("性别：女");
                    }
                else
                    {
                        System.out.println("性别：男");
                    }
            }
    }
