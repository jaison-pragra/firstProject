package com.company;

public class Commercial
{
    private String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void calculateBill(int units)
    {
        System.out.println("customer:"+getName());
        System.out.println("bill amount="+units*5.00);
    }
}
class Domestic extends Commercial
{
    void calculateBill(int units)
    {
        System.out.println("customer:"+getName());
        System.out.println("bill amount="+units*2.50);
    }
}
class ElectricityBill
{
    public static void main(String[] args)
    {
        Commercial c= new Commercial();
        //Commercial c= new Domestic();
        c.setName("jaison");
        c.calculateBill(100);
        Domestic d= new Domestic();
        d.setName("shawn");
        d.calculateBill(100);


    }
}
