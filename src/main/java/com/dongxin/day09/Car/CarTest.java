package com.dongxin.day09.Car;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/11
 */
public class CarTest
    {
        /**
         * 两套体系不能混用
         * 第一套体系：
         * nextInt():整数
         * nestDouble():小数
         * next():字符串
         * 遇到空格，制表符，回车就停止接收，这些符号后面的数据就不会接收了
         *
         * 第二套体系：
         * nextLine():字符串
         * 可以接收空格，制表符，遇到回车才停止接收数据
         *
         * @param args
         */
        public static void main(String[] args)
            {
                Car[] arr = new Car[3];
                Scanner sc = new Scanner(System.in);
                //储存
                for (int i = 0; i < 3; i++)
                    {
                        System.out.println("第" + (i + 1) + "辆汽车：");
                        System.out.print("汽车品牌：");
                        String brand = sc.next();
                        System.out.print("汽车价格：");
                        double price = sc.nextDouble();
                        System.out.print("汽车颜色：");
                        String color = sc.next();
                        Car car = new Car(brand, price, color);
                        arr[i] = car;
                    }
                //遍历
                System.out.println("==============================");
                for (int i = 0; i < arr.length; i++)
                    {
                        //Car car=new Car();
                        Car car = arr[i];
                        System.out.println("汽车品牌：" + car.getBrand());
                        System.out.println("汽车价格：" + car.getPrice());
                        System.out.println("汽车颜色：" + car.getColor());
                        System.out.println("==============================");
                    }
            }
    }
