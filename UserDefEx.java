package com.company;

public class UserDefEx extends Exception
{
    //private static int accno[] = {1001, 1002, 1003, 1004, 1005};
    //private static String name[] = {"raj", "ram", "subba", "appa", "laxmi"};
    //private static double bal[] = {10000, 12000, 5600, 999, 1100.55};

    UserDefEx()
    {
    }

    UserDefEx(String str)
    {
        super(str);
    }

}
class D
{
    private static int accno[]={1001,1002,1003,1004,1005};
    private static String name[]= {"raj","ram","subba","appa","laxmi"};
    private static double bal[]={10000,12000,5600,999,1100.55};
    void method1() throws UserDefEx {
            try
            {
                System.out.println("ACC NO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                    if (bal[i] < 1000)
                    {
                        UserDefEx me = new UserDefEx("Balance amount is less");
                        throw me;
                    }
                }
            }
            catch(UserDefEx me)
            {
                me.printStackTrace();
                throw me;

            }
        }
    }
    class C
    {
        public static void main(String[] args)
        {
            D a = new D();
           try
           {
               a.method1();
           }
           catch (UserDefEx re)
           {
               System.out.println(re);
               System.out.println("caught rethrown exception");

           }

        }
    }


