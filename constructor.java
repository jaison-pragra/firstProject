package com.company;

public class constructor {
    private String name;
    private int age;

    constructor() {
        name = "raju";
        age = 22;
    }

    constructor(String s, int i) {
        name = s;
        age = i;

    }

    void talk() {
        System.out.println("Hello, I am " + name);
        System.out.println("My age is " + age);
    }
}

class Dem {
    public static void main(String[] args) {
        constructor raju = new constructor();
        //raju.talk();
        constructor sita = new constructor("sita", 20);
        sita.talk();

    }
}
