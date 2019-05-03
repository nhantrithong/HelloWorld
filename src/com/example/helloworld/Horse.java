package com.example.helloworld;

import javax.swing.JOptionPane;

public class Horse
{
    private String name;
    private String color;
    private String birthYear;

    public void setName()
    {
        name = JOptionPane.showInputDialog(null, "Please enter the name of the horse: ");
    }

    public void setColor()
    {
        color = JOptionPane.showInputDialog(null, "Please enter the color of the horse: ");
    }

    public void setYear()
    {
        birthYear = JOptionPane.showInputDialog(null, "Please enter the birth year of the horse: ");
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public String getYear()
    {
        return birthYear;
    }
}

