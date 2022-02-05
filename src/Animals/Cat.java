package Animals;

import java.util.Scanner;

public class Cat {
    private String cName;
    private String cKind;
    private int cAge;

    public void checkCatData() {
        Scanner enterData = new Scanner(System.in);
        while (cAge <= 0) {
            System.out.println("Retype: Cats age " + cAge + "\nMust be int data!!!");
            cAge = enterData.nextInt();
        }
    }
    public void getCatInfo() {
            System.out.println("Cats name: " + cName + "\nCats Kind: " + cKind + "\nCats age: " + cAge);


    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcKind() {
        return cKind;
    }

    public void setcKind(String cKind) {
        this.cKind = cKind;
    }

    public int getcAge() {
        return cAge;
    }

    public void setcAge(int cAge) {
        this.cAge = cAge;
    }
}

