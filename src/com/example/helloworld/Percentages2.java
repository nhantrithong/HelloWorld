package com.example.helloworld;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Percentages2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        computePercent(num, num2);
    }

    public static void computePercent(double num, double num2)
    {
        DecimalFormat df=new DecimalFormat("#.##");
        double percent = (num / num2) * 100;
        System.out.println("The percentage value between these two values respectively is: " + df.format(percent) + "%");
    }
}

