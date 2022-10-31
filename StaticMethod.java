package com.company;

public class StaticMethod
{
    // int x=55; error
    static int x=55;
    static void access()
    {
        System.out.println("x="+x);
    }
}
class Demo
{
   // int y=20; error
    static int y=20;
    public static void main(String[] args)
    {
        System.out.println("y="+y);

        StaticMethod.access();
    }
}
