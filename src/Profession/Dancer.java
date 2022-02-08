package Profession;

public class Dancer extends Person {
    private String groupName;

   public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Name is: " + getName() + "\nDesignation: " + getDesignation() + "\nGroup name is: " + groupName;
    }
    public void dancing() {
        System.out.println(getName() + " likes Dancing!");
    }



}
