package School;

import java.util.Scanner;

public class Student {
    private String sName;
    private String sGroup;
    private int sLevel;

    public void checkSdata () {
        Scanner enterData = new Scanner(System.in);
        while (sLevel < 0 ) {
            System.out.println("Retype data: " + sLevel + "\n Must be int");
            sLevel = enterData.nextInt();
        }

    }
    public void getStudentsIngo () {
        System.out.println("Students names is: " + sName + "\nSTudents group is: " + sGroup + "\nStudents level is: " + sLevel);
        System.out.println();
    }
    public Student() {
    }
    public Student(String sName, String sGroup, int sLevel) {
        this.sName = sName;
        this.sGroup = sGroup;
        this.sLevel = sLevel;

    }

    public String getsName() {
        return sName;
    }


    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsGroup() {
        return sGroup;
    }

    public void setsGroup(String sGroup) {
        this.sGroup = sGroup;
    }

    public int getsLevel() {
        return sLevel;
    }

    public void setsLevel(int sLevel) {
        if (sLevel > 0) {
            this.sLevel = sLevel;
        }
        else
            System.out.println("Wrong data!!!");
    }
}
