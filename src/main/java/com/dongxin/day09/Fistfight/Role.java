package com.dongxin.day09.Fistfight;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/8/10
 */
public class Role
    {
        private String name;
        private int blood;

        public Role()
            {
            }

        public Role(String name, int blood)
            {
                this.name = name;
                this.blood = blood;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getBlood()
            {
                return blood;
            }

        public void setBlood(int blood)
            {
                this.blood = blood;
            }

        //攻击行为
        public void attack(Role role)
            {
                //造成1~20的伤害
                Random r = new Random();
                int hurt = r.nextInt(20) + 1;
                //扣血
                //三目运算符判断
                int remainBlood = role.getBlood() - hurt;
                remainBlood = remainBlood < 0 ? 0 : remainBlood;
                role.setBlood(remainBlood);
                System.out.println(this.getName() + "攻击了" + role.getName() + "，并造成了"
                        + hurt + "点伤害，" + role.getName() + "还有" + role.getBlood() + "点血量");
            }
    }
