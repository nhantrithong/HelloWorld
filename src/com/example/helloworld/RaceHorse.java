package com.example.helloworld;

import javax.swing.JOptionPane;

public class RaceHorse extends Horse
{
    private String raceNum;

    public void setRace()
    {
        raceNum = JOptionPane.showInputDialog(null, "Please enter the number of the horse's races: ");
    }

    public String getRace()
    {
        return raceNum;
    }
}
