package com.company;

public class continueUsedWithLabel
{
    public static void main(String[] args) {
        int i=1,j;
        lp1:
        while(i<=3)
        {
            System.out.print(i);
            lp2:
            for (j=1;j<=5;j++)
            {
                System.out.println("\t"+j);
                if (j==3)
                {
                    i++;
                    continue lp1;
                }
                }
            }
        }

    }

