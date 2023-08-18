package com.dongxin.day07.test1_0724;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/7/24
 */
public class Test3
    {
        /**
         * 定义方法实现随机产生一个5位的验证码
         * 验证码格式：
         * 长度为5
         * 前四位是大写字母或者小写字母
         * 最后一位是数字
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //创建一个存放大小写字母的数组
                char[] chs = new char[52];
                //利用循环和ASCII码表存入
                for (int i = 0; i < chs.length; i++)
                    {
                        if (i <= 25)
                            {
                                //97在ASCII码表中代表'a'
                                chs[i] = (char) (97 + i);
                            }
                        else
                            {
                                //65在ASCII码表中代表'A'，此处的i从26开始
                                chs[i] = (char) (65 + i - 26);
                            }
                        //System.out.print(chs[i]+" ");
                    }
                //定义一个空字符串来存储生成的验证码
                String captcha = "";
                //生成一个数组chs的随机索引
                Random r = new Random();
                for (int i = 0; i < 4; i++)
                    {
                        int randomIndex = r.nextInt(chs.length);
                        captcha = captcha + chs[randomIndex];
                    }
                //System.out.println(captcha);
                //生成一个随机数字
                int num = r.nextInt(10);
                captcha = captcha + num;
                System.out.println("最终生成的验证码为：" + captcha);
            }
    }
