package com.example.helloworld;

public class MetalElement extends Element
{
    private String elementFacts = "Metal elements are good conductors of electricity.";

    public MetalElement(String element, int atomicNumber, double atomicWeight)
    {
        super(element, atomicNumber, atomicWeight);
    }

    @Override
    public String describeElement()
    {
        return "Element Details: " + element + ". Atomic Number of: " + atomicNumber + ". Atomic Weight of: " + atomicWeight + ". " + elementFacts;
    }
}
