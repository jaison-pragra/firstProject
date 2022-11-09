package com.company;

public class Ex
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("open files");
            int n= args.length;
            System.out.println("n ="+n);
            int a = 45/n;
            System.out.println("a="+a);
            int b[]={10,20,30};
            b[50]=100;

        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
            ae.printStackTrace();

            System.out.println("PLEASE PASS DATA WHILE RUNNING THIS PROGRAM");

        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
            aie.printStackTrace();
            System.out.println("please see array index is within range");
        }
        finally
        {
            System.out.println("CLOSE FILES");

        }
    }
}
