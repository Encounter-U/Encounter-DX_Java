package com.dongxin.day09.Student;

/**
 * @author Encounter
 * @date 2023/8/12
 */
public class Student
    {
        private int schoolNum;
        private String name;
        private int age;

        public Student()
            {
            }

        public Student(int schoolNum, String name, int age)
            {
                this.schoolNum = schoolNum;
                this.name = name;
                this.age = age;
            }

        public int getSchoolNum()
            {
                return schoolNum;
            }

        public void setSchoolNum(int schoolNum)
            {
                this.schoolNum = schoolNum;
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
