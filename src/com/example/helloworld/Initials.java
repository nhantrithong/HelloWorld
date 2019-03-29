package com.example.helloworld;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Initials
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();
        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];
        String fullNameInitials = firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("Your intials are: " + fullNameInitials);
    }
}
