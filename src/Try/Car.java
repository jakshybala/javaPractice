package Try;

public class Car implements AutoCloseable {

    private String nameCar;

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                '}';
    }

    void driveMethod() {
        System.out.println("Driving !!!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Look out -> Cars door closing");
    }

    public void trafficLighter() throws Warning {
        System.out.println("");
    }

    public Car(String nameCar) {
        this.nameCar = nameToCarCheck(nameCar);
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String nameToCarCheck(String nameCar) {
        String defultName = "Defualt";

        try {
            if (nameCar == null || nameCar.length() < 2) {
                //throw new Warning(this.nameCar + "Cars name is will more than 2 or more letters!!!" );
                throw new CatchNull(this.nameCar + "DONT Be NULL");
            }
        } //catch //(Warning exception) {
        catch (NullPointerException exception) {
            return defultName;

        }
//            System.err.println(exception.getMessage());
//            return defultName;

        return nameCar;
    }
//    public void nullCatchMethod() {
//        try{
//            if(nameCar.isEmpty() || )
//        }
//        catch(NullPointerException e ){
//            doSOmethingAboutIt();
//        }
    }

