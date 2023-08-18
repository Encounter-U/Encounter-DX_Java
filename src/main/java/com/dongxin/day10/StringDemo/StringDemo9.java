package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/14
 */
public class StringDemo9 extends StringDemo8
    {
        public static void main(String[] args)
            {
                String[] moneyPool = {"亿", "千", "百", "十", "万", "千", "百", "十", "元"};
                Scanner sc = new Scanner(System.in);
                System.out.print("输入您的金额：");
                int money = sc.nextInt();
                if (money >= 0 && money <= 999999999)
                    {
                        String newStr = conversion(money);
                        //System.out.println(newStr);
                        if (newStr.length() < 9)
                            {
                                int count = 9 - newStr.length();
                                String temp = "";
                                for (int i = 0; i < count; i++)
                                    {
                                        temp += '零' + moneyPool[i];
                                    }
                                String temp2 = "";
                                for (int i = count, j = 0; i < moneyPool.length && j < newStr.length(); i++, j++)
                                    {
                                        temp2 += newStr.charAt(j) + moneyPool[i];
                                    }
                                String finalStr = temp + temp2;
                                System.out.println(finalStr);
                            }
                        else
                            {
                                String temp = "";
                                for (int i = 0; i < moneyPool.length; i++)
                                    {
                                        temp += newStr.charAt(i) + moneyPool[i];
                                    }
                                System.out.println(temp);
                            }
                    }
                else
                    {
                        System.out.println("您输入的金额有误!");
                        System.out.println("最大金额为999999999");
                    }
            }

        public static String conversion(int num)
            {
                String[] characterPool = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
                String numStr = "" + num;
                String newStr = "";
                for (int i = 0; i < numStr.length(); i++)
                    {
                        //'0'在ASCII码表中对应的是48
                        int Index = numStr.charAt(i) - 48;
                        //System.out.print(Index);
                        newStr += characterPool[Index];

                    }
                return newStr;
            }
    }
