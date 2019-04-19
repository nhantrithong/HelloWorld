package com.example.helloworld;

import java.util.Scanner;

public class CountMovieSpaces1and2
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a movie quote: ");
       String quote = scan.nextLine();
       quoteChecker(quote);
    }

    public static void quoteChecker(String quote)
    {
        int length = quote.replaceAll("[^ ]","").length();
        System.out.println("The number of spaces in this quote is equal to: " + length + " spaces");
    }
}


