package com.dongxin.day09.Student;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/12
 */
public class StudentTest
    {
        public static void main(String[] args)
            {
                //添加两条默认信息
                Student[] arr = new Student[3];
                Student s1 = new Student(001, "路明非", 22);
                Student s2 = new Student(002, "楚子航", 23);
                arr[0] = s1;
                arr[1] = s2;
                //定义一个数字表示当前数据为null的元素
                int n = 1;
                System.out.println("=======欢迎来到学生管理系统=======");
                menu();
                for (int flagNum = 0; flagNum < 1; )
                    {
                        switch (choice())
                            {
                                case 1 ->
                                    {
                                        //添加信息
                                        add(arr, n);
                                        n--;
                                        //遍历当前数组
                                        //traverse(arr, n);
                                        //显示菜单
                                        menu();
                                    }
                                case 2 ->
                                    {
                                        //查看学生信息
                                        traverse(arr, n);
                                        //显示菜单
                                        menu();
                                    }
                                case 3 ->
                                    {
                                        //根据id删除学生信息
                                        deleteById(arr, n);
                                        n++;
                                        //遍历当前数组
                                        //traverse(arr, n);
                                        //显示菜单
                                        menu();
                                    }
                                case 4 ->
                                    {
                                        //修改学生信息
                                        revise(arr, n);
                                        //遍历当前数组
                                        //traverse(arr, n);
                                    }
                                case 5 ->
                                    {
                                        //退出系统
                                        System.out.println("正在退出系统，感谢您的使用！");
                                        flagNum++;
                                    }
                                default -> System.out.println("您输入的选项有误，请重新输入！");
                            }
                    }
            }

        /**
         * 显示菜单
         */
        public static void menu()
            {
                System.out.println("1.添加学生信息");
                System.out.println("2.查看所有学生信息");
                System.out.println("3.根据id删除学生信息");
                System.out.println("4.修改学生信息");
                System.out.println("5.退出系统");
                System.out.println("==============================");

            }

        /**
         * 输入菜单选择
         *
         * @return
         */
        public static int choice()
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.print("请输入您要进行的操作所对应的序号：");
                        int choice = sc.nextInt();
                        if (choice > 0 && choice < 6)
                            {
                                return choice;
                            }
                        else
                            {
                                System.out.println("您输入的序号有误，请重新输入！");
                                System.out.println("==============================");
                            }
                    }
            }

        /**
         * 添加学生信息并进行学号的唯一性判断
         *
         * @param arr
         */
        private static void add(Student[] arr, int n)
            {
                Scanner sc = new Scanner(System.in);
                for (int i = 2; i < 3; i++)
                    {
                        while (true)
                            {
                                System.out.println("==============================");
                                System.out.print("请输入学号：");
                                int schoolNum = sc.nextInt();
                                boolean flag = false;
                                for (int j = 0; j < arr.length - n; j++)
                                    {
                                        Student student = arr[j];
                                        if (schoolNum == student.getSchoolNum())
                                            {
                                                flag = true;
                                            }
                                    }
                                System.out.print("请输入姓名：");
                                String name = sc.next();
                                for (int j = 0; j < arr.length - n; j++)
                                    {
                                        Student student = arr[j];
                                        if (name.equals(student.getName()))
                                            {
                                                flag = true;
                                            }
                                    }
                                if (!flag)
                                    {
                                        System.out.print("请输入年龄：");
                                        int age = sc.nextInt();
                                        Student student = new Student(schoolNum, name, age);
                                        arr[i] = student;
                                        System.out.println("添加成功！");
                                        System.out.println("==============================");
                                        //空元素数量减一
                                        //n--;
                                        break;
                                    }
                                else
                                    {
                                        System.out.println("您输入的学号或姓名已存在，请重新输入！");
                                    }
                            }
                    }
            }

        /**
         * 遍历所有学生信息
         *
         * @param arr
         */
        public static void traverse(Student[] arr, int n)
            {
                System.out.println("==============================");
                for (int i = 0; i < arr.length - n; i++)
                    {
                        Student student = arr[i];
                        System.out.println("学号：" + student.getSchoolNum());
                        System.out.println("姓名：" + student.getName());
                        System.out.println("年龄：" + student.getAge());
                        System.out.println("==============================");

                    }
            }

        /**
         * 根据学生id删除学生信息
         *
         * @param arr
         * @param n
         */
        public static void deleteById(Student[] arr, int n)
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.println("==============================");
                        System.out.print("请输入要删除的学生的学号：");
                        int id = sc.nextInt();
                        //判断是否有输入的学号
                        boolean flag = false;
                        //判断数组是否有元素
                        boolean flag1 = true;
                        int Index = 0;
                        for (int i = 0; i < arr.length - n; i++)
                            {
                                Student student = arr[i];
                                if (id == student.getSchoolNum())
                                    {
                                        flag = true;
                                        //记录下此时的索引
                                        Index = i;
                                    }
                                if (arr[i] != null)
                                    flag1 = false;
                            }
                        if (flag1)
                            {
                                System.out.println("后台已无学生信息！");
                                System.out.println("==============================");
                                break;
                            }
                        else if (flag)
                            {
                                arr[Index] = null;
                                System.out.println("学号为" + id + "的学生信息已删除");
                                System.out.println("==============================");
                                break;
                            }
                        else
                            {
                                System.out.println("您输入的学号不存在，请重新输入！");
                            }
                    }
            }

        /**
         * 根据学号查询学生
         *
         * @param arr
         * @param n
         * @return
         */
        public static Student selectById(Student[] arr, int n)
            {
                Scanner sc = new Scanner(System.in);
                while (true)
                    {
                        System.out.println("==============================");
                        System.out.print("请输入要查询的学生的学号：");
                        int id = sc.nextInt();
                        boolean flag = false;
                        int Index = 0;
                        for (int i = 0; i < arr.length - n; i++)
                            {
                                Student student = arr[i];
                                if (id == student.getSchoolNum())
                                    {
                                        Index = i;
                                        flag = true;
                                    }
                            }
                        if (flag)
                            {
                                return arr[Index];
                            }
                        else
                            {
                                System.out.println("未查询到您输入的学号，请重新输入！");
                            }
                    }
            }

        /**
         * 修改信息菜单
         */
        public static void reviseMeau()
            {
                System.out.println("==============================");
                System.out.println("1.修改学号");
                System.out.println("2.修改姓名");
                System.out.println("3.修改年龄");
                System.out.println("4.返回主菜单");
                System.out.println("==============================");
            }

        /**
         * 修改学生信息
         *
         * @param arr
         * @param n
         */
        public static void revise(Student[] arr, int n)
            {
                Scanner sc = new Scanner(System.in);
                reviseMeau();
                for (int flagNum = 0; flagNum < 1; )
                    {
                        System.out.print("请输入要修改的选项（填入序号即可）：");
                        int num = sc.nextInt();
                        switch (num)
                            {
                                //修改学号
                                case 1 ->
                                    {
                                        Student student = selectById(arr, n);
                                        while (true)
                                            {
                                                System.out.print("请输入修改后的学号：");
                                                int newId = sc.nextInt();
                                                //判断学号是否重复
                                                boolean flag = true;
                                                for (int i = 0; i < arr.length - n; i++)
                                                    {
                                                        Student s = arr[i];
                                                        if (newId == s.getSchoolNum())
                                                            {
                                                                flag = false;
                                                            }
                                                    }
                                                if (flag)
                                                    {
                                                        //存入数据
                                                        student.setSchoolNum(newId);
                                                        System.out.println("修改成功！");
                                                        break;
                                                    }
                                                else
                                                    {
                                                        System.out.println(
                                                                "您要修改的学号已存在或不符合规则，请重新输入！");
                                                        System.out.println("==============================");
                                                    }
                                            }
                                        reviseMeau();
                                    }
                                //修改姓名
                                case 2 ->
                                    {
                                        Student student = selectById(arr, n);
                                        while (true)
                                            {
                                                System.out.print("请输入修改后的姓名：");
                                                String newName = sc.next();
                                                //判断要修改的姓名是否有重复
                                                boolean flag = true;
                                                for (int i = 0; i < arr.length - n; i++)
                                                    {
                                                        Student s = arr[i];
                                                        if (newName.equals(s.getName()))
                                                            {
                                                                flag = false;
                                                            }
                                                    }
                                                if (flag)
                                                    {
                                                        //存入新数据
                                                        student.setName(newName);
                                                        System.out.println("修改成功！");
                                                        break;
                                                    }
                                                else
                                                    {
                                                        System.out.println(
                                                                "您要修改的姓名已存在或不符合规则，请重新输入！");
                                                        System.out.println("==============================");
                                                    }
                                            }
                                        reviseMeau();
                                    }
                                //修改年龄
                                case 3 ->
                                    {
                                        Student student = selectById(arr, n);
                                        while (true)
                                            {
                                                System.out.print("请输入修改后的年龄：");
                                                int newAge = sc.nextInt();
                                                if (newAge > 0 && newAge <= 200)
                                                    {
                                                        student.setAge(newAge);
                                                        System.out.println("修改成功！");
                                                        break;
                                                    }
                                                else
                                                    {
                                                        System.out.println("您要修改的年龄不符合规则，请重新输入！");
                                                        System.out.println("==============================");
                                                    }
                                            }
                                        reviseMeau();
                                    }
                                case 4 ->
                                    {
                                        //返回主菜单
                                        menu();
                                        flagNum++;
                                    }
                                //当前选项无菜单报错
                                default ->
                                    {
                                        System.out.println("您输入的选项有误,请重新输入！");
                                        System.out.println("==============================");
                                    }
                            }
                    }
            }
    }
