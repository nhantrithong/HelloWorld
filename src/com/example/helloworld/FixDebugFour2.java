package com.example.helloworld;

import java.text.DecimalFormat;
import java.lang.Math.*;

// Some circle statistics
public class FixDebugFour2
{
    public static void main(String args[])
    {
        double radius = 12.6;
        System.out.println("Circle statistics");
        DecimalFormat df=new DecimalFormat("#.##");
        String area = df.format(Math.PI * (radius * radius));
        System.out.println("the area is " + area);
        double diameter = 2 * radius;
        System.out.println("the diameter is " + diameter);
    }
}