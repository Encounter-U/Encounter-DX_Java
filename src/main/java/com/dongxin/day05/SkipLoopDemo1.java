package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class SkipLoopDemo1
    {
        public static void main(String[] args)
            {
                for (int i = 0; i <= 5; i++)
                    {
                        if (i == 3)
                            {
                                //continue;表示结束本次循环，继续下次循环
                                continue;
                            }
                        System.out.println("小老虎正在吃"+i+"个包子");
                    }
            }
    }
