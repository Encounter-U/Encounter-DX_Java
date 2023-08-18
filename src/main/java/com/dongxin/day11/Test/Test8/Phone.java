package com.dongxin.day11.Test.Test8;

/**
 * @author Encounter
 * @date 2023/8/16
 */
public class Phone
    {
        private String brand;
        private double price;

        public Phone()
            {
            }

        public Phone(String brand, double price)
            {
                this.brand = brand;
                this.price = price;
            }

        public String getBrand()
            {
                return brand;
            }

        public void setBrand(String brand)
            {
                this.brand = brand;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }
    }
