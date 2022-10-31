package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class leapYear
{
    public static void main(String[] args) throws IOException
        {
            InputStreamReader ir=new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(ir);
            System.out.println("enter the year");
            String str = br.readLine();
            int year=Integer.parseInt(str);
            if((year%100==0)&&(year%400==0))
            System.out.println("Leap year");
            else if (year%100!=0&&year%4==0)
            {
                System.out.println("Leap year");

            }
           else
                System.out.println("Not a Leap year");





        }
    }


