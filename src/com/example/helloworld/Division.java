package com.example.helloworld;

public abstract class Division
{
    public String divisionName;
    public String accountNumber;

    public abstract void display();

    public Division()
    {
        divisionName = "";
        accountNumber = "";
    }

    public Division(String _divisionName, String _accountNumber)
    {
        divisionName = _divisionName;
        accountNumber = _accountNumber;
    }

    public void setDivisionName(String _divisionName)
    {
        divisionName = _divisionName;
    }

    public String getDivisionName()
    {
        return divisionName;
    }

    public void setAccountNumber(String _accountNumber)
    {
        accountNumber = _accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
}
