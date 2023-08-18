package com.dongxin.day08.test_0803.Phone;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class PhoneTest
    {
        public static void main(String[] args)
            {
                //创建手机的对象
                Phone p = new Phone();
                //给属性赋值
                p.brand = "小米";
                p.price = 1999;
                //获取对象中的值
                System.out.println(p.brand);
                System.out.println(p.price);
                //调用方法
                p.call();
                p.playGame();

                //创建一个新对象
                //创建手机的对象
                Phone p2 = new Phone();
                //给属性赋值
                p2.brand = "华为";
                p2.price = 9999;
                //获取对象中的值
                System.out.println(p2.brand);
                System.out.println(p2.price);
                //调用方法
                p2.call();
                p2.playGame();
            }
    }
