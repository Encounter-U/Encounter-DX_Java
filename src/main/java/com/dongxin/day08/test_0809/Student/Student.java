package com.dongxin.day08.test_0809.Student;

/**
 * @author Encounter
 * @date 2023/8/9
 */
public class Student
    {
        private String name;
        private int age;

        /**
         * 如果自己没有写任何的构造方法
         * 虚拟机将自动生成一个空参构造方法
         * @return
         */
        public Student()
            {
                System.out.println("看我执行了没");
            }

        /**
         *
         * @return
         */
        public Student(String name,int age)
            {
                this.name=name;
                this.age=age;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }
    }
