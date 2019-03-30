package com.example.helloworld;

// This class discounts prices by 10%
public class FixDebugFour4
{
    public static void main(String[] args)
    {
        final double DISCOUNT_RATE = 0.90;
        int price = 100;
        double price2 = 80.00;
        tenPercentOff(price, DISCOUNT_RATE);
        tenPercentOff(price2, DISCOUNT_RATE);
    }
    public static void tenPercentOff(int price, double rate)
    {
        double newPrice = price * rate;
        System.out.println("Ten percent off $" + price);
        System.out.println("==> New price is $" + newPrice);
    }
    public static void tenPercentOff(double price, double rate)
    {
        double newPrice = price * rate;
        System.out.println("Ten percent off $" + price);
        System.out.println("==> New price is $" + newPrice);
    }
}