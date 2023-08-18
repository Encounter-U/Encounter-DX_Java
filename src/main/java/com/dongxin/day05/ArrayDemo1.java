package com.dongxin.day05;

/**
 * @author Encounter
 * @date 2023/7/22
 */
public class ArrayDemo1
    {
        /**
         * 静态初始化数组
         *
         * @param args
         */
        public static void main(String[] args)
            {
                //储存五个学生的年龄
                int[] arr1=new int[]{11,12,13,14,15};
                int[] arr2={11,12,13,14,15};
                System.out.println(arr1);//[I@4eec7777

                //储存三个学生的姓名
                String[] arr3=new String[]{"路明非","上杉绘梨衣","楚子航"};
                String[] arr4={"路明非","上杉绘梨衣","楚子航"};
                System.out.println(arr3);//[Ljava.lang.String;@3b07d329

                //储存四个学生的身高
                double[] arr5=new double[]{1.99,1.98,1.97,1.96};
                double[] arr6={1.99,1.98,1.97,1.96};
                System.out.println(arr6);//[D@41629346 这个是数组在内存中的地址值

                /**
                 * 扩展：
                 *解释一下地址值的格式含义 [D@41629346
                 * [ :表示当前是一个数组
                 * D :表示当前数组里的元素是double类型的
                 * @ :表示一个间隔符号（固定格式）
                 * 41629346 :这才是数组真正的地址值
                 * 平时习惯性的将这个整体叫做数组的地址值
                 */
            }
    }
