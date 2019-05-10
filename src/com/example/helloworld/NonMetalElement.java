package com.example.helloworld;

public class NonMetalElement extends Element{

    private String elementFacts = "Non-Metal elements are NOT good conductors of electricity.";

    public NonMetalElement(String element, int atomicNumber, double atomicWeight)
    {
        super(element, atomicNumber, atomicWeight);
    }

    @Override
    public String describeElement()
    {
        return "Element Details: " + element + ". Atomic Number of: " + atomicNumber + ". Atomic Weight of: " + atomicWeight + ". " + elementFacts;
    }
}
