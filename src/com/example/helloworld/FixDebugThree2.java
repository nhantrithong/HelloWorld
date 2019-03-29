package com.example.helloworld;

// This application displays some math facts
public class FixDebugThree2
{
    public static void main(String[] args)
    {
        int a = 2, b = 5, c = 10;
        add(a, b);
        add(b, c);
        subtract(c, a);
    }

    public static void add(int valueOne, int valueTwo)
    {
        System.out.println("The sum of " + valueOne + " and " + valueTwo + " is " + (valueOne + valueTwo));
    }

    public static void subtract(int valueOne, int valueTwo)
    {
        System.out.println("The difference between " + valueOne + " and " + valueTwo + " is " + (valueOne - valueTwo));
    }
}
//© 2019 GitHub, Inc.