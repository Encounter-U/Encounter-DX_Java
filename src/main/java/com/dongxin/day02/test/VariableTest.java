package com.dongxin.day02.test;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class VariableTest
    {
        public static void main(String[] args)
            {
                //一开始没有乘客
                int count = 0;
                //第一站：上去一位
                count += 1;
                //第二站：上去两位，下来一位
                count = count + 2 - 1;
                //第三站：上去两位，下来一位
                count = count + 2 - 1;
                //第四站：下来一位
                count = count - 1;
                //第五站：上去一位
                count = count + 1;
                //问：到了终点站，车上还有几位乘客
                System.out.println("此时车上还有"+count+"位乘客");
            }
    }
