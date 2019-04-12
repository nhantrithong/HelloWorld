package com.example.helloworld;

import java.util.Scanner;

public class Factorials
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number:");
        int number = scan.nextInt();
        int i;
        int factorial=1;
        for(i=1;i<=number;i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of "+ number +" is: "+ factorial);
    }
}
