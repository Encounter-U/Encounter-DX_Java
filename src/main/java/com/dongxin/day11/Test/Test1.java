package com.dongxin.day11.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < 3; i++)
                    {
                        System.out.print("输入元素：");
                        list.add(sc.next());
                    }
                //System.out.println(list);
                System.out.print("[");
                for (int i = 0; i < list.size(); i++)
                    {
                        if (i == list.size() - 1)
                            System.out.print(list.get(i));
                        else
                            System.out.print(list.get(i) + ",");
                    }
                System.out.print("]");
            }
    }
