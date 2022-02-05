package Animals;

import java.util.Scanner;

public class Dog {
    private String dName;
    private String dKind;
    private int dAge;

    public void chechDogData () {
        Scanner enterData = new Scanner(System.in);
        while (dAge <= 0){
            System.out.println("Retype: Dog age " + dAge + "\nMust be int data!!!");
            dAge = enterData.nextInt();
        }
    }
    public void etDogInfo () {
        System.out.println("dog name is: " + dName + "\nDog Kind is: " + dKind + "\nDog age is: " + dAge);

    }


    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdKind() {
        return dKind;
    }

    public void setdKind(String dKind) {
        this.dKind = dKind;
    }

    public int getdAgege() {
        return dAge;
    }

    public void setdAge(int dAge) {
        this.dAge = dAge;
    }
}
