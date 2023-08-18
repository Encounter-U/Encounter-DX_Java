package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class LogicOperatorDemo3
    {
        public static void main(String[] args)
            {
                // &&
                System.out.println(true && true);
                System.out.println(false && false);
                System.out.println(false && true);
                System.out.println(true && false);

                // ||
                System.out.println(true || true);
                System.out.println(false || false);
                System.out.println(false || true);
                System.out.println(true || false);

                //短路逻辑运算符具有短路效果，左边的表达式可确定结果时右边就不会参与运行了
                int a = 10;
                int b = 10;
                boolean re = ++a < 5 && ++b < 5;
                System.out.println(re);
                System.out.println(a);
                System.out.println(b);

                //没有短路原则时
                int m = 10;
                int n = 10;
                boolean rs = ++m < 5 & ++n < 5;
                System.out.println(rs);
                System.out.println(m);
                System.out.println(n);
            }
    }
