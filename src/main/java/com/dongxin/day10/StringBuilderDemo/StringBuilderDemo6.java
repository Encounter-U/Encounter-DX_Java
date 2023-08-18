package com.dongxin.day10.StringBuilderDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringBuilderDemo6
    {
        public static void main(String[] args)
            {
                StringBuilder sb = new StringBuilder();

                //查看容量：最大能装多少
                System.out.println(sb.capacity());
                //查看长度：已经装了多少
                System.out.println(sb.length());

                sb.append("abcaiusndiuahfiethsgdxfwabfui");
                sb.append("sdfbiwgadfasdddfssuaciwdasdas");
                sb.append("a");
                System.out.println(sb.capacity());
                System.out.println(sb.length());
            }
    }
