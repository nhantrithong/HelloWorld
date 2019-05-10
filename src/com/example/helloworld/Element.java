package com.example.helloworld;

public abstract class Element
{
    public String element;
    public int atomicNumber;
    public double atomicWeight;

    public Element(String element, int atomicNumber, double atomicWeight)
    {
        this.element = element;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getElement()
    {
        return element;
    }

    public void setElement(String element)
    {
        this.element = element;
    }

    public int getAtomicNumber()
    {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber)
    {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicWeight()
    {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight)
    {
        this.atomicWeight = atomicWeight;
    }

    public abstract String describeElement();
}
