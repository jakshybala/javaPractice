package Profession;

public class Person {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " Studying in University");
    }
    public void  walk() {
        System.out.println(name + " Walk in park");
    }
    public void eat() {
        System.out.println(name + " Eat healthy food");
    }
    @Override
    public String toString() {
        return "Name is: " + name + "\nDesignation is: " + designation;

    }
}