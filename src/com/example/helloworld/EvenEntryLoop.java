package com.example.helloworld;

import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type either an even number or the sentinel value 999: ");
        int inputNum = scan.nextInt();
        numberChecker(inputNum);
    }

    public static void numberChecker(int inputNum)
    {
        while (inputNum == (int)inputNum)
        {
            if (inputNum % 2 != 0 && inputNum != 999)
            {
                System.out.println("Error! Please re-input an appropriate value!");
                Scanner scan = new Scanner(System.in);
                int newInput = scan.nextInt();
                numberChecker(newInput);
            }
            else if (inputNum % 2 == 0)
            {
                System.out.println("Good Job! Input another value!");
                Scanner scan = new Scanner(System.in);
                int newInput = scan.nextInt();
                numberChecker(newInput);
            }
            else if(inputNum == 999)
            {
                System.out.println("The program has stopped");
                System.exit(0);
            }
        }
    }
}
