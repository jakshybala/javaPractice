package Auto;

public class Truck extends Vehicle{

    @Override
    void driveMethod() {
        System.out.println("We drive " + super.getTypeOfEngine());
    }

    public Truck(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }
}

