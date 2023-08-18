package com.dongxin.day03;

/**
 * @author Encounter
 * @date 2023/7/20
 */
public class AssigningOperatorDemo1
    {
        /**
         * 以+=为例，其余相似
         * @param args
         */
        public static void main(String[] args)
            {
                //+= 左右相加，结果赋值给左边
                int a = 10;
                int b = 20;
                a += b;//等同于a=(int)(a+b);
                System.out.println("a:" + a);
                System.out.println("b:" + b);

                /**
                 * 细节：
                 *      +=,-=,*=,/=,%=底层都隐藏了一个强制类型转换
                 */
                short s=1;
                s+=1;//等同于s=(short)(s+1);
                System.out.println(s);
            }
    }
