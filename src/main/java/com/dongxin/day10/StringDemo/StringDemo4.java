package com.dongxin.day10.StringDemo;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/13
 */
public class StringDemo4
    {
        /**
         * 模拟用户登录
         *
         * @param args
         */
        public static void main(String[] args)
            {
                String username = "Encounter";
                String password = "20020628";
                Scanner sc = new Scanner(System.in);
                int count = 0;
                while (true)
                    {
                        if (count >= 3)
                            {
                                System.out.println("账号：Encounter");
                                System.out.println("密码：20020628");
                            }
                        System.out.print("账号：");
                        String user = sc.next();
                        System.out.print("密码：");
                        String psw = sc.next();
                        boolean flag = true;
                        if (!(user.equals(username) && psw.equals(password)))
                            {
                                flag = false;
                            }
                        if (flag)
                            {
                                System.out.println("登陆成功");
                                break;
                            }
                        else
                            {
                                System.out.println("登陆失败，重新输入");
                                count++;
                            }
                    }
            }
    }
