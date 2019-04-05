package com.example.helloworld;

import java.util.Scanner;

public class CondoSales2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose one of the options provided below by typing in the correlating number");
        System.out.println("1. Park view");
        System.out.println("2. Golf course view");
        System.out.println("3. Lake view");
        int selection = scan.nextInt();
        System.out.println("Please specify your demands by selecting one of the options below:");
        System.out.println("1. Garage space");
        System.out.println("2. Parking space");
        int selectionTwo = scan.nextInt();
        if (selection == 1 && selectionTwo == 1)
        {
            System.out.println("Condos with park views are listed at a total price of $150,000");
            System.out.println("In total with your demands for parage space, the total price adds up to $155,000");
        }
        else if (selection == 1 && selectionTwo == 2)
        {
            System.out.println("Condos with park views are listed at a total price of $150,000");
            System.out.println("In total with your demands for parking space, the total price remains at $150,000");
        }
        else if (selection == 2 && selectionTwo == 1)
        {
            System.out.println("Condos with gold course views are listed at a total price of $170,000");
            System.out.println("In total with your demands for garage space, the total price adds up to $175,000");
        }
        else if (selection == 2 && selectionTwo == 2)
        {
            System.out.println("Condos with gold course views are listed at a total price of $170,000");
            System.out.println("In total with your demands for parking space, the total price remains at $170,000");
        }
        else if (selection == 3 && selectionTwo == 1)
        {
            System.out.println("Condos with lake views are listed at a total price of $210,000");
            System.out.println("In total with your demands for garage space, the total price adds up to $215,000");
        }
        else if (selection == 3 && selectionTwo == 2)
        {
            System.out.println("Condos with lake views are listed at a total price of $210,000");
            System.out.println("In total with your demands for garage space, the total price remains at $210,000");
        }
        else
        {
            System.out.println("Invalid option. Price = $0");
        }
    }
}
