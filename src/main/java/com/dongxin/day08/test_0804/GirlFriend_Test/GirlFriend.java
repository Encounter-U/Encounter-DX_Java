package com.dongxin.day08.test_0804.GirlFriend_Test;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class GirlFriend
    {
        //属性
        private String name;
        private int age;
        private String gender;

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
                if (age >= 18 && age <= 25)
                    {
                        this.age = age;
                    }
                else
                    {
                        System.out.println("非法参数");
                    }
            }

        public String getGender()
            {
                return gender;
            }

        public void setGender(String gender)
            {
                this.gender = gender;
            }

        //行为
        public void sleep()
            {
                System.out.println("女朋友在睡觉");
            }

        public void eat()
            {
                System.out.println("女朋友在吃饭");
            }
    }
