package com.example.helloworld;

import java.util.Scanner;

public class CondoSales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose one of the options provided below by typing in the correlating number");
        System.out.println("1. Park view");
        System.out.println("2. Golf course view");
        System.out.println("3. Lake view");
        int selection = scan.nextInt();
        if (selection == 1)
        {
            System.out.println("Condos with park views are listed at a total price of $150,000");
            boolean validity;
            validity = true;
        }
        else if (selection == 2)
        {
            System.out.println("Condos with gold course views are listed at a total price of $170,000");
        }
        else if (selection == 3)
        {
            System.out.println("Condos with lake views are listed at a total price of $210,000");
        }
        else
        {
            System.out.println("Invalid option. Price = $0");
        }
    }
}
