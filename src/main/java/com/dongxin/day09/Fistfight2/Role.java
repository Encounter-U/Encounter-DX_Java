package com.dongxin.day09.Fistfight2;

import java.util.Random;

/**
 * @author Encounter
 * @date 2023/8/10
 */
public class Role
    {
        private String name;
        private int blood;
        private char gender;
        private String face;

        //长相
        String[] boyFace = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
        String[] girlFace = {"美轮美奂", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

        //attack 攻击描述
        String[] attack_desc = {
                "%s使出了一招【游龙破军】，转身到对方的身后，一掌向%s背心的灵台穴拍去。",
                "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
                "%s大喝一声，身形下伏，一招【劈雷坠地】，锤向%s双腿。",
                "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
                "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的锤向%s。",
                "%s上步枪身，招中套招，一招【天动万象】，连环攻向%s。",
        };
        //injured 受伤描述
        String[] injured_desc = {
                "结果%s退了半步，毫发无损",
                "结果给%s造成了一处瘀伤",
                "结果一击命中，%s痛的弯下腰",
                "结果%s痛苦地闷哼了一声，显然受了点内伤",
                "结果%s摇摇晃晃，一跤摔到在地",
                "结果%s脸色一下变得惨白，连退了好几步",
                "结果『轰』的一声，%s口中鲜血狂喷而出",
                "结果%s一声惨叫，像滩软泥般塌了下去",
        };

        public Role()
            {
            }

        public Role(String name, int blood, char gender)
            {
                this.name = name;
                this.blood = blood;
                this.gender = gender;
                setFace(gender);
            }

        public char getGender()
            {
                return gender;
            }

        public void setGender(char gender)
            {
                this.gender = gender;
            }

        public String getFace()
            {
                return face;
            }

        public void setFace(char gender)
            {
                Random r = new Random();
                if (gender == '男')
                    {
                        int boy = r.nextInt(boyFace.length);
                        this.face = boyFace[boy];
                    }
                else if (gender == '女')
                    {
                        int girl = r.nextInt(girlFace.length);
                        this.face = girlFace[girl];
                    }
                else
                    {
                        this.face = "面目狰狞";
                    }
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
                Random r = new Random();
                //攻击效果
                int Index = r.nextInt(attack_desc.length);
                String KungFu = attack_desc[Index];
                System.out.printf(KungFu, this.getName(), role.getName());
                System.out.println();
                //造成1~20的伤害
                int hurt = r.nextInt(20) + 1;
                //扣血
                //三目运算符判断
                int remainBlood = role.getBlood() - hurt;
                remainBlood = remainBlood < 0 ? 0 : remainBlood;
                role.setBlood(remainBlood);
                //System.out.println(this.getName() + "攻击了" + role.getName() + "，并造成了"
                //+ hurt + "点伤害，" + role.getName() + "还有" + role.getBlood() + "点血量");

                /**
                 * 受伤的描述
                 * 血量 > 90 0索引的描述
                 * 80 ~ 90 1索引的描述
                 * 70 ~ 80 2索引的描述
                 * 60 ~ 70 3索引的描述
                 * 40 ~ 60 4索引的描述
                 * 20 ~ 40 5索引的描述
                 * 10 ~ 20 6索引的描述
                 * 小于10的 7索引的描述
                 */
                if (remainBlood >= 90)
                    {
                        System.out.printf(injured_desc[0], role.getName());
                    }
                else if (remainBlood >= 80 && remainBlood < 90)
                    {
                        System.out.printf(injured_desc[1], role.getName());
                    }
                else if (remainBlood >= 70 && remainBlood < 80)
                    {
                        System.out.printf(injured_desc[2], role.getName());
                    }
                else if (remainBlood >= 60 && remainBlood < 70)
                    {
                        System.out.printf(injured_desc[3], role.getName());
                    }
                else if (remainBlood >= 40 && remainBlood < 60)
                    {
                        System.out.printf(injured_desc[4], role.getName());
                    }
                else if (remainBlood >= 20 && remainBlood < 40)
                    {
                        System.out.printf(injured_desc[5], role.getName());
                    }
                else if (remainBlood >= 10 && remainBlood < 20)
                    {
                        System.out.printf(injured_desc[6], role.getName());
                    }
                else
                    {
                        System.out.printf(injured_desc[7], role.getName());
                    }
                System.out.println();
            }

        //展示角色信息
        public void showRoleInfo()
            {
                System.out.println("姓名：" + this.getName());
                System.out.println("血量：" + this.getBlood());
                System.out.println("性别：" + this.getGender());
                System.out.println("相貌：" + this.getFace());
            }
    }
