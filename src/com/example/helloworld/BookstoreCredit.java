package com.example.helloworld;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your Grade Point Average (GPA): ");
        double gpa = scan.nextDouble();
        bookstoreCredit(name, gpa);
    }

    public static void bookstoreCredit(String name, double gpa)
    {
        double credit = gpa * 10;
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println(" ");
        System.out.println("...");
        System.out.println(" ");
        System.out.println("Congratulations " + name + "!, you're eligible for a bookstore credit value of: $" + df.format(credit));
    }

}


