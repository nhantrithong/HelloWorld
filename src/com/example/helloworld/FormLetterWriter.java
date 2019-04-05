package com.example.helloworld;

import java.util.Scanner;

public class FormLetterWriter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter your first name:");
        String firstname = scan.nextLine();
        System.out.println("Please enter your last name:");
        String lastname = scan.nextLine();
        displaySalutation(lastname);
        displaySalutation(firstname, lastname);
    }

    public static void displaySalutation(String lastname)
    {
        System.out.println(" ");
        System.out.println("Dear Mr. or Ms." + lastname);
        System.out.println("Thank you for your recent order");
        System.out.println(" ");
    }

    public static void displaySalutation(String firstname, String lastname)
    {
        System.out.println("Dear Mr. or Ms." + firstname + " " + lastname);
        System.out.println("Thank you for your recent order");
    }
}


