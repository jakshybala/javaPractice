package com.company;

public class Company {
    public static void main(String[] args) {
        Uchburchtuk rectengle = new Uchburchtuk();
        rectengle.a = 13;
        rectengle.b = 14;
        rectengle.c = 15;
        System.out.println("Here we are used  Void Method");
        rectengle.areaMethod();
        System.out.println("Here we are used  Return Method");
        System.out.println(rectengle.areaReturnMethod(12, 15, 16));
    }
}
