package Try;

import java.util.Arrays;

public class MainTry {
    public static void main(String[] args) {

        try (Car carObj = new Car("Mercedes")){
            carObj.driveMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Car carObj2 = new Car("Audi");
        Car carObj3 = new Car("");
        Car[] carsArray = {carObj2, carObj3};
        System.out.println(Arrays.toString(carsArray));







    }
}
