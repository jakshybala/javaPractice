package Auto;

public class Car extends Vehicle{

    @Override
    void driveMethod() {
        System.out.println("We drive " + super.getModel());
    }

    public Car(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }
}
