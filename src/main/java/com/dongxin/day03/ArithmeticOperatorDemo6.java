package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class ArithmeticOperatorDemo6
    {
        public static void main(String[] args)
            {
                int x = 10;
                //先用后加
                int y = x++;
                //先加后用
                int z = ++x;
                System.out.println("x:" + x);
                System.out.println("y:" + y);
                System.out.println("z:" + z);
            }
    }
