package Klass;

import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int[] array ;

    //Конструктор
    public Class (int nomer, String soz, int[] array) {
        this.nomer = nomer;
        this.soz = soz;
        this.array = array;
    }
    public void getClassInfo() {
        System.out.println("Number: " + nomer + "\nWord: " + soz + "\nInt Array: " + Arrays.toString(array));
        System.out.print("Other way to print Array: ");

        for (int newArray: array){
            System.out.print(newArray + " ");
        }
    }

    public int getNomer () {
        return nomer;
    }
    public void setNomer (int nomer) {
        this.nomer = nomer;
    }
    public String getSoz () {
        return soz;
    }
    public void setSoz (String soz) {
        this.soz = soz;
    }
    public int[] getArray () {
        return array;
    }
    public void setArray (int[] array) {
        this.array = array;
    }
    }

