package com.company;

public class strSplit
{
    public static void main(String[] args) {
        String str = "Hello,this is a book on java";
        String s[];
        s= str.split(" ");
        for (int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
}
