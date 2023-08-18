package com.dongxin.day11.Test.Test8;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Test8
    {
        public static void main(String[] args)
            {
                ArrayList<Phone> phones = new ArrayList<>();
                Phone p1 = new Phone("小米", 1999);
                Phone p2 = new Phone("Apple", 9999);
                Phone p3 = new Phone("锤子", 2999);
                phones.add(p1);
                phones.add(p2);
                phones.add(p3);
                ArrayList<Phone> newPhone = price(phones, 3000);
                for (int i = 0; i < newPhone.size(); i++)
                    {
                        System.out.print(newPhone.get(i).getBrand() + " ");
                        System.out.println(newPhone.get(i).getPrice());
                    }
            }

        /**
         * 若要返回多个数据，可将其先放到一个容器中，再把容器返回
         * 集合||数组
         *
         * @param phones
         * @param price
         * @return
         */
        public static ArrayList<Phone> price(ArrayList<Phone> phones, int price)
            {
                ArrayList<Phone> p = new ArrayList<>();
                for (int i = 0; i < phones.size(); i++)
                    {
                        if (phones.get(i).getPrice() < price)
                            {
                                p.add(phones.get(i));
                            }
                    }
                return p;
            }
    }
