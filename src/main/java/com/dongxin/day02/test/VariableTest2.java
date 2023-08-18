package com.dongxin.day02.test;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class VariableTest2
    {
        public static void main(String[] args)
            {
                //定义变量记录姓名
                String name = "董鑫";
                //定义变量记录年龄
                int age = 21;
                //定义变量记录性别
                char gender = '男';
                //定义变量记录身高
                double height = 179.0;
                //定义变量记录是否单身
                //true单身 false非单身
                boolean flag = true;

                //输出值
                System.out.println("姓名：" + '\t' + name);
                System.out.println("年龄：" + '\t' + age);
                System.out.println("性别：" + '\t' + gender);
                System.out.println("身高：" + '\t' + height);
                System.out.println("是否单身：" +  flag);
            }
    }
