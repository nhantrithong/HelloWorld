package com.example.helloworld;

import java.util.Scanner;

public class NumbersDemo2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        displayTwiceTheNumber(number);
        displayNumberPlusFive(number);
        displayNumberSquared(number);
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

