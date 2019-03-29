package com.example.helloworld;

import java.text.DecimalFormat;

// This program calculates tutition bills as credits times rate per credit hour
public class FixDebugThree4
{
    public static void main(String[] args)
    {
        int myCredits = 13;
        int yourCredits = 17;
        double rate = 75.84;
        System.out.println("My tuition:");
        tuitionBill(myCredits, rate);
        System.out.println("Your tuition:");
        tuitionBill(yourCredits, rate);
    }
    public static void tuitionBill(double paraCredits, double paraRate) //void means that there are no retuns, whenever there is a System.out.println() statement, that will just return on its on without a return statement
    //However, if you want to return a variable, then instead of void it must be the type of that returning variable
    {
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("Total due $" + df.format(paraCredits * paraRate));
    }
}
