package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class ArithmeticOperatorDemo2
    {
        public static void main(String[] args)
            {
                /**
                 * 整数参与计算，结果只能得到整数
                 * 小数参与计算，结果有可能精确
                 */
                // /
                System.out.println(6/3);
                System.out.println(7/3);
                System.out.println(7.0/3);//结果：2.3333333333333335
                //%
                System.out.println(6%3);
                System.out.println(7%3);

                /**
                 * 应用场景：
                 * 1.可以用取模来判断，a是否可以被b整除
                 *   a%b   10%3
                 * 2.可以判断a是否为偶数
                 *   a%2 若结果为0，则a为偶数，若为1则为奇数
                 * 3.在之后，斗地主发牌
                 *   把每张牌都定义一个序号
                 *   序号%3
                 *   结果为1，发给第一个玩家
                 *   结果为2，发给第二个玩家
                 *   结果为0，发给第三个玩家
                 */
            }
    }
