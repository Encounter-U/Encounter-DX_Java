package com.dongxin.day09.Goods;

/**
 * @author Encounter
 * @date 2023/8/11
 */
public class GoodsTest
    {
        public static void main(String[] args)
            {
                //创建数组
                Goods[] arr=new Goods[3];

                //创建三个商品 快捷键：Ctrl+p
                Goods g1=new Goods("001","红米K40",1999,100);
                Goods g2=new Goods("002","红米K60",2499,100);
                Goods g3=new Goods("003","Redmi Buds 4 Pro",299,100);

                //将商品加入数组中
                arr[0]=g1;
                arr[1]=g2;
                arr[2]=g3;

                //遍历
                for (int i = 0; i < arr.length; i++)
                    {
                        //直接遍历得到的是g1等的地址值
                        Goods goods=arr[i];
                        System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
                    }
            }
    }
