package com.company;

public class getChars
{
    public static void main(String[] args) {
        String s="Hello, this is a book on java";
        char arr[] = new char[20];
        s.getChars(7,21,arr,0);
        System.out.println(arr);
    }
}
