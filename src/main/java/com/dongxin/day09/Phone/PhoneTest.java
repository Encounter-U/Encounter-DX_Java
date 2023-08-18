package com.dongxin.day09.Phone;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/11
 */
public class PhoneTest
    {
        public static void main(String[] args)
            {
                Phone[] arr = new Phone[3];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 3; i++)
                    {
                        System.out.println("第" + (i + 1) + "部手机：");
                        System.out.print("手机品牌：");
                        String brand = sc.next();
                        System.out.print("手机价格：");
                        double price = sc.nextDouble();
                        System.out.print("手机颜色：");
                        String color = sc.next();
                        //创建对象并储存
                        Phone phone = new Phone(brand, price, color);
                        arr[i] = phone;
                    }
                //遍历数组求均值
                int sum = 0;
                for (int i = 0; i < arr.length; i++)
                    {
                        Phone phone = arr[i];
                        sum += phone.getPrice();
                    }
                System.out.println("三部手机平均价格为：" + (sum / arr.length));
            }
    }
