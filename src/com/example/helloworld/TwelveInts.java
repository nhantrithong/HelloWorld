package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwelveInts
{
    public static void main(String[] args)
    {
     List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
     List invertedList = new ArrayList();
     for (int i = numbers.size() - 1 ; i >= 0; i --) //minus 1 because 11 is the index of the last number (12)
     {
         invertedList.add(numbers.get(i)); //i = index --> get 11 = get number 12
     }
     System.out.println("List sorted from first to last:" + numbers);
     System.out.println("List sorted from last to first:" + invertedList);
    }
}
