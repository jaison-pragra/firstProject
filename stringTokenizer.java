package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringTokenizer
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);
        System.out.println("enter \n name,age,sex");
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str,",");
        String str1= st.nextToken();
        String str2 = st.nextToken();
        String str3=st.nextToken();
        str1=str1.trim();
        str2=str2.trim();
        str3=str3.trim();
        int age=Integer.parseInt(str2);
        char sex=str3.charAt(0);
        System.out.println("name="+str1);
        System.out.println("age="+age);
        System.out.println("sex="+sex);
        String arr[];
        char as[];
        char[] re={'a','b','c','d'};
        as=re;
        as[1]='w';
        //arr[0]="qwerty";
       // arr= {"q","we"};




    }
}
