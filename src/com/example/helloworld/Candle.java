package com.example.helloworld;

public class Candle
{
    protected String color;
    protected double price, height;

    public Candle() {}

    public Candle (String color, Double height)
    {
        setColor(color);
        setHeight(height);
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setHeight(double height)
    {
        this.height = height;
        this.price = height * 2;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    public double getHeight()
    {
        return height;
    }
}
