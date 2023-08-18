package com.dongxin.day11.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                //创建集合
                ArrayList<Integer> list = new ArrayList<>();
                //添加元素
                //JDK5以后，int Integer之间可以相互转化
                for (int i = 0; i < 3; i++)
                    {
                        System.out.print("输入数字：");
                        int num = sc.nextInt();
                        list.add(num);
                    }
                System.out.print("[");
                for (int i = 0; i < list.size(); i++)
                    {
                        if (i == list.size() - 1)
                            System.out.print(list.get(i));
                        else
                            System.out.print(list.get(i) + ",");
                    }
                System.out.println("]");
            }
    }
