package com.example.helloworld;

import java.util.Scanner;

public class CarCareChoice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cody's Car Care Shop! Please select one of the options below:");
        System.out.println("1. Oil Change");
        System.out.println("2. Tire Rotation");
        System.out.println("3. Battery Check");
        System.out.println("4. Brake Inspection");
        Integer option = scan.nextInt();
        checkOption(option);
    }

    public static void checkOption(Integer option)
    {
     if (option == 1)
     {
         System.out.println("Oil change Fee: $25");
     }

    else if (option == 2)
     {
         System.out.println("Tire Rotation: $22");
     }

    else if (option == 3)
     {
         System.out.println("Battery Check: $15");
     }

    else if (option == 4)
     {
        System.out.println("Brake Inspection: $5");
     }
    else
     {
         System.out.println("Error");
     }
    }
}
