package com.dongxin.day08.test_0809.Student;

/**
 * @author Encounter
 * @date 2023/8/9
 */
public class StudentTest
    {
        public static void main(String[] args)
            {
                //创建对象  调用空参构造
                //Student s = new Student();

                //调用有参构造
                Student s = new Student("王禾佳", 18);
                System.out.println(s.getName());
                System.out.println(s.getAge());
            }
    }
