package com.example.helloworld;

//import DecimalFormat;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        String minuteInput;
        double minute;
        minuteInput = JOptionPane.showInputDialog(null, "Enter number of minutes",
                JOptionPane.INFORMATION_MESSAGE);
        minute = Integer.parseInt(minuteInput);
        double hours = minute / 60;
        double days = minute / 1440;
        DecimalFormat df=new DecimalFormat("#.##");
        String hoursConverted = df.format(hours);
        String daysConverted = df.format(days);
        JOptionPane.showMessageDialog(null, minute + " minutes converted to hours: " + hoursConverted  + ", converted to days: " + daysConverted);
    }
}
