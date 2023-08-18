package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class InfiniteLoopDemo1
    {
        public static void main(String[] args)
            {
                //for格式的无限循环
                /*for (; ; )
                    {
                        System.out.println("学习");
                    }*/

                //while格式的无线循环
                /*while (true)
                    {
                        System.out.println("学习");
                    }*/

                /**
                 * 注意事项：
                 * 无限循环的下面不能继续再写其他代码了，因为循环永远停不下来，那么下面的代码永远执行不到
                 */
                while (true)
                    {
                        System.out.println("表白");
                    }
                //System.out.println("幻想时间");
            }
    }
