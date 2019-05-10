package com.example.helloworld;

public class ElementArray
{
    public static void main(String[] args)
    {
        Element[] element = new Element[4];

        element[0] = new MetalElement("Lithium", 3, 6.941);
        element[1] = new MetalElement("Sodium", 11, 22.98977);
        element[2] = new NonMetalElement("Hydrogen", 1, 1.007);
        element[3] = new NonMetalElement("Oxygen", 8, 15.999);

        for (int i = 0; i < element.length; i++)
        {
            System.out.println(element[i].describeElement());
        }
    }
}
