package com.example.helloworld;

public class DemoPoem
{
    public static void main(String[] args)
    {
        Poem BillAndAlice = new Poem("Bill and Alice",10);
        BillAndAlice.display();
        Haiku Beep = new Haiku("Beep");
        Beep.display();
        Limerick Boop = new Limerick("Boop");
        Boop.display();
        Couplet Baap = new Couplet("Baap");
        Baap.display();
    }
}
