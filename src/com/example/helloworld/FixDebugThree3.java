package com.example.helloworld;

// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3
{
    public static void main(String[] args)
    {
        String name;
        String gottenName;
        gottenName = getName();
        displayGreeting(gottenName);
    }

    public static String getName()
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scan.nextLine();
        return name;
    }

    public static void displayGreeting(String parameterName)
    {
        System.out.println("Hello, " + parameterName + "!");
    }
}
