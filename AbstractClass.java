package com.company;

abstract class AbstractClass
{
      double rate;
    abstract void getRate();
    void calculateBill(int units)
    {
        System.out.print("bill amount for"+units+"units :");
        System.out.println(rate*units);
    }
}
class Commercialplan extends AbstractClass
{
    void getRate()
    {
        rate=5;

    }
}

class Domesticplan extends AbstractClass
{
    void getRate()
    {
        rate=2.60;

    }
}

class calculate
{
    public static void main(String[] args) {
        AbstractClass p;
        System.out.println("Commercial connection:");

       //class a =new AbstractClass();

        p= new Commercialplan();
        p.getRate();
        p.calculateBill(250);

        System.out.println("Domestic connection:");
        p= new Domesticplan();
        p.getRate();
        p.calculateBill(150);

    }
}
