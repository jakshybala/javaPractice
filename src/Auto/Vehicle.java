package Auto;

import java.time.LocalDate;

public abstract class Vehicle {
    String model;
    int yearOfIssue;
    TypeOfEngine typeOfEngine;

    abstract void driveMethod();

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }

    public Vehicle(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        this.model = model;
        this.yearOfIssue = checkYear(yearOfIssue);
        this.typeOfEngine = typeOfEngine;
    }

    private int checkYear(int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        try {
            if (yearOfIssue < currentYear - 50) {
                throw new InvalidYear(this.model + " have invalid year of issue [" + yearOfIssue + "]" + " will change by defult to " + currentYear);


            }

        } catch (InvalidYear exception) {
            System.err.println(exception.getMessage());
            return currentYear;
        }
        return yearOfIssue;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
