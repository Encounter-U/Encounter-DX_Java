package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class LogicOperatorDemo2
    {
        public static void main(String[] args)
            {
                // ^ 异或 相同为false 不同为true
                System.out.println(true ^ true);
                System.out.println(false ^ false);
                System.out.println(false ^ true);
                System.out.println(true ^ false);

                // ! 取反 要么不写，要么最多只写一次
                System.out.println(!true);
                System.out.println(!false);
            }
    }
