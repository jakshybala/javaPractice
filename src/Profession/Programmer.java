package Profession;

public class Programmer extends Person {
    private String company;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String name, String designation, String company) {
        super(name, designation);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void coding() {
        System.out.println(getName() + " likes coding in Java!");
    }
    public String toString() {
        return "Name is: " + getName() + "\nDesignation: " + getDesignation() + "\nThe company name is: " + company;
    }

}
