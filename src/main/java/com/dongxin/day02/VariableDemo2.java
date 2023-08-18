package com.dongxin.day02;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class VariableDemo2
    {
        //主入口
        public static void main(String[] args)
            {
                //定义变量并输出,变量名不允许重复定义，变量在使用前必须要赋值
                int a = 10;
                System.out.println(a);

                //变量参与计算
                int b = 10;
                int c = 20;
                System.out.println(b + c);

                //修改变量的值
                a = 50;
                System.out.println(a);

                System.out.println("--------------------------");

                /**
                 * 注意事项
                 * 在一条语句中，可以定义多个变量
                 */
                int d=20,e=30,f=40;
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);

            }
    }
