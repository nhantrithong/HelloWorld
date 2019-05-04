package com.example.helloworld;

public class ScentedCandle extends Candle
{
    protected String scent;

    public ScentedCandle() {}

    public ScentedCandle(String color, Double height, String scent)
    {
        super(color, height);
        setScent(scent);
    }

    public void setScent(String scent)
    {
        this.scent = scent;
    }

    public String getScent()
    {
        return scent;
    }

    @Override
    public void setHeight(double height)
    {
        this.height = height;
        this.price = height * 3;
    }
}

