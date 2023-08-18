package com.dongxin.day09.Fistfight;

/**
 * @author Encounter
 * @date 2023/8/10
 */
public class GameTest
    {
        public static void main(String[] args)
            {
                Role r1=new Role("王禾佳",100);
                Role r2=new Role("董鑫",100);
                while (true)
                    {
                        r1.attack(r2);
                        if (r2.getBlood()==0)
                            {
                                System.out.println(r1.getName()+"打败了"+r2.getName());
                                break;
                            }
                        r2.attack(r1);
                        if (r2.getBlood()==0)
                            {
                                System.out.println(r2.getName()+"打败了"+r1.getName());
                                break;
                            }
                    }
            }
    }
