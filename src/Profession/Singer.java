package Profession;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public String toString() {
        return "Name is: " + getName() + "\nDesignation is: " + getDesignation() + "\nBand name is: " + bandName;
    }
    public void singing() {
        System.out.println(getName() + " singing!");
    }
    public void playGitar() {
        System.out.println(getName() + " plays in Guitar");
    }
}
