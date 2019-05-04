package com.example.helloworld;

public class ItemSold
{
    protected int invoiceNo;
    protected String description;
    protected Double price;
    public ItemSold() {}

    public ItemSold(int invoiceNo, String descritpion, Double price)
    {
        this.invoiceNo = invoiceNo;
        this.description = description;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Invoice No.: " + invoiceNo + ". Description: " + description + ". Price: $" + price);
    }

    public int getInvoiceNo()
    {
        return invoiceNo;
    }

    public String getDescription()
    {
        return description;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

}
