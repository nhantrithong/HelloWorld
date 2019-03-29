package com.example.helloworld;

import java.text.DecimalFormat;

public class Percentages
{
    public static void main(String[] args)
    {
        double var3 = 5;
        double var4 = 20;
        computePercent(var3, var4);
    }

    public static void computePercent(double var3, double var4)
    {
        DecimalFormat df=new DecimalFormat("#.##");
        double percent = (var3 / var4) * 100;
        System.out.println("The percentage value between these two values respectively is: " + df.format(percent) + "%");
    }
}

