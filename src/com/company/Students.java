package com.company;

import java.util.Scanner;

public class Students {


        private int birthdayDate;
        private String sName;
        private String sSurname;
        private int howOld;



    public void checkData (){
        Scanner enterData = new Scanner(System.in);
        while (howOld < 0) {
            System.out.println("retype how old you: " + howOld + " Wrong data!!!");
            howOld = enterData.nextInt();
        }

    }
    public void getStudets (){


        System.out.println("Birthday date: " + birthdayDate + "\nStudent name: " + sName + "\nSurname: " + sSurname + "\nHow old you: " +  howOld);
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(int birthdayDate) {
        if (birthdayDate > 0) {
            this.birthdayDate = birthdayDate;
        }
        else
            this.birthdayDate = 111111;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSurname() {
        return sSurname;
    }

    public void setsSurname(String sSurname) {
        this.sSurname = sSurname;
    }

    public int getHowOld() {
        return howOld;
    }


    public void setHowOld(int howOld) {

        this.howOld = howOld;

    }
}
