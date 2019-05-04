package com.example.helloworld;

public class DemoCandles
{
    public static void main(String[] args)
    {
        Candle candle = new Candle("blue", 4.0);
        System.out.println("Color: " + candle.getColor() + " Height: " + candle.getHeight() + " Price: " + candle.getPrice());
        ScentedCandle scented = new ScentedCandle("blue",4.0,"Turkey");
        System.out.println("Color: " + scented.getColor() + " Height: " + scented.getHeight() + " Price: " + scented.getPrice() + " Scent: "  + scented.getScent());
    }
}
