package com.dongxin.day11.Test.Test4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Test4
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                //创建集合
                ArrayList<Student> students = new ArrayList<>();
                System.out.println("====================");
                for (int i = 0; i < 2; i++)
                    {
                        System.out.print("姓名：");
                        String name = sc.next();
                        System.out.print("年龄：");
                        int age = sc.nextInt();
                        //存的是地址值，创建对象必须放循环里，放外面会被覆盖
                        students.add(new Student(name, age));
                        System.out.println("====================");
                    }
                for (int i = 0; i < students.size(); i++)
                    {
                        System.out.println("姓名：" + students.get(i).getName());
                        System.out.println("年龄：" + students.get(i).getAge());
                        System.out.println("====================");
                    }
            }
    }
