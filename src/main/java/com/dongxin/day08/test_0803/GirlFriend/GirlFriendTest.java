package com.dongxin.day08.test_0803.GirlFriend;

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
                gf1.name = "王禾佳";
                gf1.age = 18;
                gf1.gender = "不萌的妹子";

                System.out.println(gf1.name);
                System.out.println(gf1.age);
                System.out.println(gf1.gender);

                gf1.eat();
                gf1.sleep();

                System.out.println("====================");
                //第二个女朋友
                GirlFriend gf2 = new GirlFriend();
                gf2.name = "王禾佳二号";
                gf2.age = 18;
                gf2.gender = "萌妹子";

                System.out.println(gf2.name);
                System.out.println(gf2.age);
                System.out.println(gf2.gender);

                gf2.eat();
                gf2.sleep();
            }
    }
