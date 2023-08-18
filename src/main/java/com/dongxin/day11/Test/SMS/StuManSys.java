package com.dongxin.day11.Test.SMS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class StuManSys
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();
                System.out.println("============欢迎来到学生管理系统============");
                //显示菜单
                menu();
                for (int flagNum = 0; flagNum < 1; )
                    {
                        switch (choice())
                            {
                                case 1 -> add(students);//添加学生
                                case 2 ->
                                    {
                                        //根据id删除学生
                                        System.out.print("输入要删除的学生的id：");
                                        int id = sc.nextInt();
                                        if (selectIdBy(students, id))
                                            delete(students, id);
                                    }
                                case 3 ->
                                    {
                                        System.out.print("输入要修改的学生的id：");
                                        int id = sc.nextInt();
                                        if (selectIdBy(students, id))
                                            update(students, id);
                                    }
                                case 4 -> selectAll(students);//遍历所有学生
                                case 5 -> flagNum++;//退出系统
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }

        /**
         * 用户菜单
         */
        public static void menu()
            {
                System.out.println("1.添加学生");
                System.out.println("2.删除学生");
                System.out.println("3.修改学生");
                System.out.println("4.查询学生");
                System.out.println("5.退出系统");
                System.out.println("========================================");
                System.out.print("请输入您的选择：");
            }

        /**
         * 用户菜单的选择
         *
         * @return
         */
        public static int choice()
            {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                return choice;
            }

        /**
         * 判断id是否存在，返回true或false,不带提示
         *
         * @param students
         * @return
         */
        public static boolean selectId(ArrayList<Student> students, int id)
            {
                //判断id是否存在,默认不存在
                boolean flag = false;
                for (int i = 0; i < students.size(); i++)
                    {
                        if (id == students.get(i).getId())
                            {
                                //存在
                                flag = true;
                                break;
                            }
                    }
                return flag;
            }

        /**
         * 判断id是否存在，返回true或false,附带提示信息
         *
         * @param students
         * @param id
         * @return
         */
        public static boolean selectIdBy(ArrayList<Student> students, int id)
            {
                if (selectId(students, id))
                    {
                        //存在，不做处理
                    }
                else
                    {
                        //不存在，提示并返回主菜单
                        System.out.println("您选择的id不存在，已返回初始菜单！");
                        System.out.println("========================================");
                        menu();
                    }
                return selectId(students, id);
            }

        /**
         * 添加学生并判断id的唯一性
         *
         * @param students
         */
        public static void add(ArrayList<Student> students)
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.print("id：");
                        int id = sc.nextInt();
                        //判断id是否重复
                        //selectId()判断id存在即重复，返回值为true
                        if (!selectId(students, id))
                            {
                                System.out.print("姓名：");
                                String name = sc.next();
                                System.out.print("年龄：");
                                int age = sc.nextInt();
                                System.out.print("家庭住址：");
                                String address = sc.next();
                                students.add(new Student(id, name, age, address));
                                System.out.println("学号为" + id + "的学生已添加完毕！");
                                System.out.println("========================================");
                                //添加之后返回主菜单
                                menu();
                                break;
                            }
                    }
            }

        /**
         * 根据id删除学生
         *
         * @param students
         */
        public static void delete(ArrayList<Student> students, int id)
            {
                for (int i = 0; i < students.size(); i++)
                    {
                        if (id == students.get(i).getId())
                            {
                                students.remove(i);
                                System.out.println("学号为" + id + "的学生信息已删除完毕！");
                                System.out.println("========================================");
                                //删除成功之后返回主菜单
                                menu();
                                break;
                            }
                    }
            }

        /**
         * 根据id修改学生信息
         *
         * @param students
         */
        public static void update(ArrayList<Student> students, int id)
            {
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < students.size(); i++)
                    {
                        if (id == students.get(i).getId())
                            {
                                System.out.print("输入修改后的id：");
                                int newId = sc.nextInt();
                                //更改后的id可以与原id相同(代码不会，日后再改)
                                boolean flag = true;
                                for (int j = 0; j < students.size(); j++)
                                    {
                                        if (newId == students.get(j).getId())
                                            {
                                                flag = false;
                                                break;
                                            }
                                    }
                                if (!selectIdBy(students, newId)&&flag)
                                    {
                                        if (selectId(students, id))
                                            {
                                                System.out.print("姓名：");
                                                String newName = sc.next();
                                                System.out.print("年龄：");
                                                int newAge = sc.nextInt();
                                                System.out.print("家庭住址：");
                                                String newAddress = sc.next();
                                                students.set(i, new Student(newId, newName, newAge, newAddress));
                                                System.out.println("原学号为" + id + "的学生信息已修改完毕");
                                                System.out.println("========================================");
                                                //修改完之后返回主菜单
                                                menu();
                                                break;
                                            }
                                    }
                            }
                    }
            }

        /**
         * 遍历并输出所有学生信息
         *
         * @param students
         */
        public static void selectAll(ArrayList<Student> students)
            {
                if (students.size() != 0)
                    {
                        System.out.println("id\t\t姓名\t年龄\t家庭住址 ");
                        for (int i = 0; i < students.size(); i++)
                            {
                                Student stu = students.get(i);
                                System.out.println(
                                        stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
                            }
                        System.out.println("========================================");
                    }
                else
                    {
                        System.out.println("暂无数据，请存储数据之后再重新查询！");
                        System.out.println("========================================");
                    }
                //查询之后返回主菜单
                menu();
            }
    }
