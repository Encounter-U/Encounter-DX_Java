package com.dongxin.day08.test_0804.GirlFriend_Test;

/**
 * @author Encounter
 * @date 2023/8/3
 */
public class GirlFriendTest
    {
        public static void main(String[] args)
            {
                //第一个女朋友
                GirlFriend gf1 = new GirlFriend();
                gf1.setName("王禾佳");
                gf1.setAge(18);
                gf1.setGender("不萌的妹子");

                System.out.println(gf1.getName());
                System.out.println(gf1.getAge());
                System.out.println(gf1.getGender());

                gf1.eat();
                gf1.sleep();

                System.out.println("====================");
                //第二个女朋友
                GirlFriend gf2 = new GirlFriend();
                gf2.setName("王禾佳二号");
                gf2.setAge(-18);
                gf2.setGender("萌妹子");

                System.out.println(gf2.getName());
                System.out.println(gf2.getAge());
                System.out.println(gf2.getGender());

                gf2.eat();
                gf2.sleep();
            }
    }
