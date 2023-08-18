package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class ArithmeticOperatorDemo1
    {
        public static void main(String[] args)
            {
                /**
                 * 计算时若有小数参与，计算结果有可能不精确
                 */
                System.out.println(1.1+1.1);//精确
                System.out.println(1.1+1.01);//不精确 2.1100000000000003
                //+
                System.out.println(3+2);
                //-
                System.out.println(3-2);
                //*
                System.out.println(3*2);
            }
    }
