package com.example.helloworld;

public class NumbersDemo
{
    public static void main(String[] args)
    {
        int var1 = 6;
        displayTwiceTheNumber(var1);
        displayNumberPlusFive(var1);
        displayNumberSquared(var1);
        System.out.println(" ");
        int var2 = 23;
        displayTwiceTheNumber(var2);
        displayNumberPlusFive(var2);
        displayNumberSquared(var2);
    }

    public static void displayTwiceTheNumber(int var)
    {
        System.out.println("The value that is twice that of " + var + " is: " + (var * 2));
    }

    public static void displayNumberPlusFive(int var)
    {
        System.out.println("The value that is 5 more than that of " + var + " is: " + (var + 5));
    }

    public static void displayNumberSquared(int var)
    {
        System.out.println("The value of " + var + " squared is: " + (var * var));
    }

}

