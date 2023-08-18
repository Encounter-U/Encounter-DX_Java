package com.dongxin.day10.StringDemo;

/**
 * @author Encounter
 * @date 2023/8/15
 */
public class StringDemo10
    {
        public static void main(String[] args)
            {
                String phone = "15839986320";
                String head = phone.substring(0, 3);
                String tail = phone.substring(7);
                String phoneNum = head + "****" + tail;
                System.out.println(phoneNum);
            }
    }
