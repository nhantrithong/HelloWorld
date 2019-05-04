package com.example.helloworld;

public class DemoItemsAndPets
{
    public static void main (String[] args)
    {
        ItemSold box = new ItemSold(1, "A Box", 50.00);
        box.display();
        ItemSold can = new ItemSold(2, "A Can", 25.00);
        can.display();
        PetSold bob = new PetSold(3, "Cat named Bob",200.00, true,false,false);
        bob.display();
        PetSold bill = new PetSold(4, "Dog named Bill", 300.00, false, true, true);
        bill.display();
    }
}
