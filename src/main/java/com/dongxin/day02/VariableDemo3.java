package com.dongxin.day02;

/**
 * @author Encounter
 * @date 2023/7/19
 */
public class VariableDemo3
    {
        public static void main(String[] args)
            {
                /**
                 * 整数和小数取值范围大小关系：
                 * double>float>long>int>short>byte
                 */
                //整数型
                //byte -128~127
                byte b = 10;
                System.out.println(b);
                //short -32768~32767
                short s = 20;
                System.out.println(s);
                //int -2147483648~2147483647（10位数）
                int i = 30;
                System.out.println(i);
                //long -9223372036854775808~9223372036854775807（19位数）
                /**
                 * 若要定义long类型的变量
                 * 在数据值的后面要加一个L或l作为后缀，建议大写
                 */
                long l = 99999999999L;
                System.out.println(l);

                //浮点数
                //float -3.401298e-28~3.402823e+38
                //默认为double类型，所以要加F或f，推荐大写
                float f = 10.1F;
                System.out.println(f);
                //double -4.9000000e-324~1.797693e+308
                double d = 20.2;
                System.out.println(d);

                //字符
                //char 0-65535
                char c = '董';
                System.out.println(c);

                //布尔
                //boolean true,false
                boolean bo = true;
                System.out.println(bo);
            }
    }
