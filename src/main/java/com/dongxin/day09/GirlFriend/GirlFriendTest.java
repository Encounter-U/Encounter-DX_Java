package com.dongxin.day09.GirlFriend;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/11
 */
public class GirlFriendTest
    {
        public static void main(String[] args)
            {
                GirlFriend[] arr = new GirlFriend[4];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 4; i++)
                    {
                        System.out.println("第" + (i + 1) + "个女朋友：");
                        System.out.print("姓名：");
                        String name = sc.next();
                        System.out.print("年龄：");
                        int age = sc.nextInt();
                        System.out.print("性别：");
                        //仅读取输入的第一个字符
                        char gender = sc.next().charAt(0);
                        System.out.print("爱好：");
                        String hobby = sc.next();

                        GirlFriend girlFriend = new GirlFriend(name, age, gender, hobby);
                        arr[i] = girlFriend;
                    }
                //遍历求平均年龄
                int sum = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        GirlFriend g = arr[i];
                        sum += g.getAge();
                    }
                int avgAge = sum / args.length;
                System.out.println("平均年龄为：" + avgAge);
                //打印出年龄小于平均年龄的女朋友的信息
                System.out.println("==============================");
                for (int i = 0; i < arr.length; i++)
                    {
                        GirlFriend g = arr[i];
                        if (g.getAge() < avgAge)
                            {
                                System.out.println("姓名：" + g.getName());
                                System.out.println("年龄：" + g.getAge());
                                System.out.println("性别：" + g.getGender());
                                System.out.println("爱好：" + g.getHobby());
                                System.out.println("==============================");
                            }
                    }
            }
    }
