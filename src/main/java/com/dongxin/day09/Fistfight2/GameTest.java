package com.dongxin.day09.Fistfight2;

/**
 * @author Encounter
 * @date 2023/8/10
 */
public class GameTest
    {
        public static void main(String[] args)
            {
                Role r1=new Role("王禾佳",100,'女');
                Role r2=new Role("董鑫",100,'男');

                //展示角色信息
                System.out.println("===================");
                r1.showRoleInfo();
                System.out.println("===================");
                r2.showRoleInfo();
                System.out.println("===================");

                int count=1;
                while (true)
                    {
                        System.out.println("第"+count+"回合：");
                        count++;
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
