package com.example.helloworld;

public class UseBook
{
    public static void main(String[] args)
    {
        Book hemingway = new Book("Hemingway",
                "Green Hills of Africa", 234, 50.0);
        Book clancy = new Book("Clancy",
                "The Hunt for Red October",
                490, 39.0);
        Book grisham = new Book("Grisham",
                "The Firm", 550, 28.0);

        System.out.println(hemingway + "\n");
        System.out.println(clancy + "\n");
        System.out.println(grisham);
    }
}