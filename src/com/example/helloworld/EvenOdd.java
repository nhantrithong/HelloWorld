package com.example.helloworld;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This an odd number");
        }
    }


}
