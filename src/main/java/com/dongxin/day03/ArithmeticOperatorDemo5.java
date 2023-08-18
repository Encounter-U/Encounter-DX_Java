package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class ArithmeticOperatorDemo5
    {
        public static void main(String[] args)
            {
                /**
                 * 当++和--单放一行时，无论在变量的前面还是后面，结果都一样
                 */
                //++ --
                int a=10;
                a++;
                System.out.println(a);//11
                ++a;
                System.out.println(a);//12
                a--;
                System.out.println(a);//11
                --a;
                System.out.println(a);//10
            }
    }
