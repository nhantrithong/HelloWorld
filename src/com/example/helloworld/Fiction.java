package com.example.helloworld;

public class Fiction extends Book implements Comparable<Fiction>
{
    protected String mainCharacter = new String("none");
    public Fiction()
    {
        super();
    }

    public Fiction(String theAuthor, String theTitle,
                   int thePages, Double theValue, String theMainCharacter) {
        super(theAuthor, theTitle, thePages, theValue);
        mainCharacter = theMainCharacter;
    }

    public void setMainCharacter(String theMainCharacter)
    {
        mainCharacter = theMainCharacter;
    }

    public String getMainCharacter()
    {
        return mainCharacter + "";
    }

    public String toString()
    {
        return super.toString() + "\nMain Character: " + mainCharacter;
    }

    public int compareTo(Fiction obj)
    {
        //Comparable cFiction = this;
        //return (price == (((Fiction) obj).price));
        Double dPrice = price;
        return (new Double(price)).compareTo(new Double(obj.price));
    }
}
