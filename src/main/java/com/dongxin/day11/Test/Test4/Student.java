package com.dongxin.day11.Test.Test4;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Student
    {
        private String name;
        private Integer age;

        public Student()
            {
            }

        public Student(String name, Integer age)
            {
                this.name = name;
                this.age = age;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public Integer getAge()
            {
                return age;
            }

        public void setAge(Integer age)
            {
                this.age = age;
            }
    }
