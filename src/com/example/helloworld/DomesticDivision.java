package com.example.helloworld;

public class DomesticDivision extends Division
{
    public String state;

    public DomesticDivision()
    {
        super();
        state = "";
    }

    public DomesticDivision(String _divisionName, String _accountNumber, String _state)
    {
        super(_divisionName, _accountNumber);
        state = _state;
    }

    public void setState(String _state)
    {
        state = _state;
    }

    public String getState()
    {
        return state;
    }

    public void display()
    {
        System.out.println(getDivisionName());
        System.out.println("Company Name: Coca Cola");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }

    public void displayCharge()
    {
        System.out.println("Location for Account Number " + getAccountNumber() + " is relocated to " + state + ".");
    }
}


