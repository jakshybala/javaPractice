package com.company;

public class Rectangle {
    private int a;
    private int b;
    private int c;


//    Return Method
//    public double rectangleMethod(double a, double b, double c) {
//        double perimert = a + b + c;
//        double poluperimetr = perimert / 2;
//        return  (Math.sqrt(poluperimetr * (poluperimetr - a) * (poluperimetr - b) * (poluperimetr - c)));
//
//    }
    public void rectangleMethodVoid (){
        double perimetr = a + b + c;
        double poluperimetr = perimetr / 2;
        System.out.println(Math.sqrt(poluperimetr*(poluperimetr-a) * (poluperimetr - b) * (poluperimetr - c)));


    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
