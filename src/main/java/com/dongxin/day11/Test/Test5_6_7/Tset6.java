package com.dongxin.day11.Test.Test5_6_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Tset6
    {
        /**
         * 返回索引 -1
         *
         * @param args
         */
        public static void main(String[] args)
            {
                ArrayList<User> users = new ArrayList<>();
                System.out.println("====================");
                for (int i = 0; i < 2; i++)
                    {
                        add(users);
                        System.out.println("====================");
                    }
                System.out.println("查询的元素索引为：" + selectById(users));
                System.out.println("====================");
            }

        /**
         * 键盘录入插入数据
         *
         * @param users
         */
        public static void add(ArrayList<User> users)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("id:");
                int id = sc.nextInt();
                System.out.print("username:");
                String username = sc.next();
                System.out.print("password:");
                String password = sc.next();
                users.add(new User(id, username, password));
            }

        /**
         * 根据id查询
         *
         * @param users
         * @return
         */
        public static int selectById(ArrayList<User> users)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("输入要查询的id：");
                int id = sc.nextInt();
                for (int i = 0; i < users.size(); i++)
                    {
                        if (id == users.get(i).getId())
                            {
                                return i;
                            }
                    }
                return -1;
            }
    }
