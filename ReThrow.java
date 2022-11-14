package com.company;

public class ReThrow
{
    void method1()
    {
        try
        {
            String str ="hello";
            char ch = str.charAt(5);
        }
        catch (StringIndexOutOfBoundsException sie)
        {
            System.out.println("Please see the index is within the range");
            throw sie;
        }
    }
}
class B
{
    public static void main(String[] args)
    {
        ReThrow a = new ReThrow();
        try
        {
            a.method1();

        }
        catch (StringIndexOutOfBoundsException sie)
        {
            System.out.println("I caught the rethrown exception");
        }

    }
}
