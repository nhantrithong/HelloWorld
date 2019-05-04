package com.example.helloworld;

public class PetSold extends ItemSold
{
    Boolean vacc, neut, house;

    public PetSold(int invoiceNo, String description, Double price, Boolean vacc, Boolean neut, Boolean house)
    {
        super(invoiceNo, description, price);
        this.vacc = vacc;
        this.neut = neut;
        this.house = house;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Vaccination status: " + vacc + ". Neutered status: " + neut + ". Housebroked status: " + vacc);
    }

    public Boolean getVacc()
    {
        return vacc;
    }

    public Boolean getNeut()
    {
        return neut;
    }

    public Boolean getHouse()
    {
        return house;
    }

    public void setVacc(Boolean vacc)
    {
        this.vacc = vacc;
    }

    public void setNeut(Boolean neut)
    {
        this.neut = neut;
    }

    public void setHouse(Boolean house)
    {
        this.house = house;
    }
}
