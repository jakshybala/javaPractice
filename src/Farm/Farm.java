package Farm;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cowArray;
    private Horse[] horseArray;
    private Sheep[] sheepArray;
    private String owenerName;

    public String getAddress() {
        return address;
    }

    public Sheep[] getSheepArray() {
        return sheepArray;
    }
    public void setSheepArray(Sheep[] sheepArray) {
        this.sheepArray = sheepArray;
    }
    public Cow[] getCowArray() {
        return cowArray;
    }
    public void setSheepArray(Cow[] cowArray) {
        this.cowArray = cowArray;
    }
    public Horse[] getHorseArray() {
        return horseArray;
    }
    public void setHorseArray(Horse[] horseArray) {
        this.horseArray = horseArray;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwenerName() {
        return owenerName;
    }

    public void setOwenerName(String owenerName) {
        this.owenerName = owenerName;
    }

    public Farm(String address, String owenerName, Sheep[] sheepArray, Cow[] cowArray, Horse[] horseArray) {
        this.sheepArray = sheepArray;
        this.address = address;
        this.owenerName = owenerName;
        this.cowArray = cowArray;
        this.horseArray = horseArray;

    }
    public void methodFarm() {
        System.out.println("Address: " + getAddress() + "\nOwener name is: " + getOwenerName() + "\nTotal sheep is: " + sheepArray.length);
        System.out.println("Other Data");
        for (Animals countAnimal: sheepArray) {
//            countAnimal.methodAnimal();
            countAnimal.methodAnimal();
        }
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", owenerName='" + owenerName + '\'' +
                "\nTotal Cow is: " + cowArray.length +
                ", cowArray=" + Arrays.toString(cowArray) +
                "\nTotal Horse is: " + horseArray.length +
                ", horseArray=" + Arrays.toString(horseArray) +
                "\nTotoal Sheep is: " + sheepArray.length +
                ", sheepArray=" + Arrays.toString(sheepArray) +
                '}';
    }
}
