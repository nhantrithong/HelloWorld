package com.example.helloworld;

import java.text.DecimalFormat;

// This class calculates a waitperson's tip as 15% of the bill
public class FixDebugThree1
{
    public static void main(String[] args)
    {
        double myCheck = 50.00;
        double yourCheck = 19.95;
        System.out.println("Tips are:");
        calcTip(myCheck);
        calcTip(yourCheck);
    }
    public static double calcTip(double bill)
    {
        final double RATE = 0.15;
        double tip = bill + RATE;
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("The tip should be at least $" + df.format(tip));
        return bill;
    }
}