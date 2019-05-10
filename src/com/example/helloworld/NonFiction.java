package com.example.helloworld;

public class NonFiction extends Book
{
    protected String topic = new String("TBD");

    public NonFiction()
    {
        super();
    }

    public NonFiction(String theAuthor, String theTitle, int thePages, Double thePrice)
    {
        super(theAuthor, theTitle, thePages, thePrice);
    }

    public NonFiction(String theAuthor, String theTitle, int thePages, Double thePrice, String theTopic)
    {
        super(theAuthor, theTitle, thePages, thePrice);

        topic = theTopic;
    }

    public String getTopic()
    {
        return topic;
    }

    public String toString()
    {
        return super.toString() + "\nTopic: " + topic;
    }
}
