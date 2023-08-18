package com.dongxin.day10.Test;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class Test4
    {
        public static void main(String[] args)
            {
                //生成验证码中的字母
                String captcha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                char[] chs = captcha.toCharArray();
                Random r = new Random();
                char[] code = new char[5];
                for (int i = 0; i < code.length; i++)
                    {
                        int index = r.nextInt(chs.length);
                        code[i] = chs[index];
                    }
                //存入数字
                code[4] = (char) (r.nextInt(10) + 48);
                //打乱验证码
                for (int i = 0; i < code.length; i++)
                    {
                        int index = r.nextInt(code.length);
                        char temp = code[i];
                        code[i] = code[index];
                        code[index] = temp;
                    }
                System.out.println(new String(code));
            }
        //public static void
    }
