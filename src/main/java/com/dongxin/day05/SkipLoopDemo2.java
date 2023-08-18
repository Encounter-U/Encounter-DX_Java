package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class SkipLoopDemo2
    {
        public static void main(String[] args)
            {
                for (int i = 1 ; i <= 5; i++)
                    {
                        System.out.println("小老虎正在吃"+i+"个包子");
                        if (i == 3)
                            {
                                //break;表示结束整个循环
                                break;
                            }
                    }
            }
    }
