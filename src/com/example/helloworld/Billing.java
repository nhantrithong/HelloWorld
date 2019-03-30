package com.example.helloworld;

import java.text.DecimalFormat;

public class Billing
{
    public static void main(String[] args)
    {
        double TAX = 0.08;
        double price = 10;
        int quantity = 4;
        int coupon = 8;
        computeBill(TAX, price);
        computeBill(TAX, price, quantity);
        computeBill(TAX, price, quantity, coupon);
    }

    public static void computeBill(double TAX, double price)
    {
        DecimalFormat df=new DecimalFormat("#.##");
        double totalPrice = price + (price * TAX);
        System.out.println("The price of your purchase with tax is: $" + df.format(totalPrice));
    }

    public static void computeBill(double TAX, double price, int quantity)
    {
        DecimalFormat df=new DecimalFormat("#.##");
        double totalPrice = (price * quantity) + ((price * quantity) * TAX);
        System.out.println("The price of your purchase with tax is: $" + df.format(totalPrice));
    }

    public static void computeBill(double TAX, double price, int quantity, int coupon)
    {
        DecimalFormat df=new DecimalFormat("#.##");
        double totalPrice = ((price * quantity) - coupon) + (((price * quantity) - coupon) * TAX);
        System.out.println("The price of your purchase with tax is: $" + df.format(totalPrice));
    }
}


