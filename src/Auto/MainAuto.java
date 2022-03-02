package Auto;

import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static Auto.TypeOfEngine.*;

public class MainAuto {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota", 1950, FUEL);
        Vehicle car2 = new Car("Kia", 2000, HYRBRID);
        Vehicle car3 = new Car("Mercedes", 2022, TypeOfEngine.ELECTROMOBILE);
        Vehicle car4 = new Car("Jia", 2005, TypeOfEngine.FUEL);
        Vehicle car5 = new Car("Honda", 2020, TypeOfEngine.HYRBRID);
        //track
        Vehicle truck1 = new Truck("Man", 1950, TypeOfEngine.FUEL);
        Vehicle truck2 = new Truck("Volvo", 1999, TypeOfEngine.FUEL);
        Vehicle truck3 = new Truck("Mercedes", 2022, ELECTROMOBILE);
        Vehicle truck4 = new Truck("Kamaz", 2001, ELECTROMOBILE);
        Vehicle truck5 = new Truck("Uaz", 2022, TypeOfEngine.HYRBRID);

        //other Array
        Vehicle[] carAll = {car1, car2, car3, car4, car5, truck1, truck2, truck3, truck4, truck5};
        int counter = 0;
        for (int i = 0; i < carAll.length; i++) {
            if (carAll[i].typeOfEngine.equals(ELECTROMOBILE) || carAll[i].typeOfEngine.equals(FUEL)) {
                counter++;
                System.out.println("Hybrid cars: " + carAll[i]);
            }
        }
        System.out.println("Hybrid cars: " + counter++);
        System.out.println("___________");

        //Array
        Vehicle[] vehicles = new Vehicle[]{car1, car2, car3, car4, car5, truck1, truck2, truck3, truck4, truck5};

        //printElementsOfArray(vehicles);
        //run methods
        //ElectromOblie cars
        int quantyOfElectricMobile = getQuantyOfElectricMobile(vehicles);
        Vehicle[] eletricVechiles = new Vehicle[quantyOfElectricMobile];
        eletricVechiles = getOnlyElectricCar(eletricVechiles, vehicles);
        System.out.println("Quanty Of Elecrtic cars: " + quantyOfElectricMobile);
        printElementsOfArray(eletricVechiles);

        //Fuel Cars
        int quantyOfFuel = getQuantyOfFuel(vehicles);
        Vehicle[] fuelVehicles = new Vehicle[quantyOfFuel];
        fuelVehicles = getFuelVehicles(fuelVehicles, vehicles);
        System.out.println("Quanty of Fuel Cars: " + quantyOfFuel);
        printElementsOfArray(fuelVehicles);

        //Hybrid Cars
        int quantyHybrid = getQuantyOfHybridVehicle(vehicles);
        Vehicle[] hybridVehicle = new Vehicle[quantyHybrid];
        hybridVehicle = getOnlyHybridVehicle(hybridVehicle, vehicles);
        System.out.println("Quanty Hybrid Cars: " + quantyHybrid);
        printElementsOfArray(hybridVehicle);
        // Arrays.sort(hybridVehicle, Collections.reverseOrder());

        //Universal Method to get typeOfEngine
        Vehicle[] allVehicle = getAllVehicle(vehicles, FUEL);
        System.out.println("Universal Methods");
        printElementsOfArray(allVehicle);

        System.out.println("______________________");


    }

    private static Vehicle[] getOnlyElectricCar(Vehicle[] newEmptyArray, Vehicle[] vechicles) {
        int counterForNewEmptyArray = 0;

        for (Vehicle vehicle : vechicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTROMOBILE)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    //getQuality of cars

    private static int getQuantyOfElectricMobile(Vehicle[] vehicles) {
        int electricCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTROMOBILE)) {
                electricCounter++;
            }
        }
        return electricCounter;
    }

    // print array elements
    private static void printElementsOfArray(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    private static int getQuantyOfFuel(Vehicle[] vehicles) {
        int countFuel = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                countFuel++;
            }

        }

        return countFuel;
    }

    private static Vehicle[] getFuelVehicles(Vehicle[] newEmptyFuel, Vehicle[] vehicles) {
        int counternewEmptyFuel = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                newEmptyFuel[counternewEmptyFuel] = vehicle;
                counternewEmptyFuel++;
            }

        }
        return newEmptyFuel;
    }

    private static int getQuantyOfHybridVehicle(Vehicle[] vehicles) {
        int countHybridVehicle = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(HYRBRID)) {
                countHybridVehicle++;
            }

        }
        return countHybridVehicle;
    }

    private static Vehicle[] getOnlyHybridVehicle(Vehicle[] newEmptyHybrid, Vehicle[] vehicles) {
        int counterNewHybrid = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(HYRBRID)) {
                newEmptyHybrid[counterNewHybrid] = vehicle;
                counterNewHybrid++;
            }


        }
        return newEmptyHybrid;
    }

    private static int getQuantyAllCarsMethod(Vehicle[] vehicles, TypeOfEngine typeOfEngine) {
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(typeOfEngine)) {
                count ++;
            }

        }
        return count;
    }

    private static Vehicle[] getAllVehicle(Vehicle[] vehicles, TypeOfEngine typeOfEngine) {
        int lenghtOfArray = getQuantyAllCarsMethod(vehicles, typeOfEngine);
        Vehicle[] newVehicle = new Vehicle[lenghtOfArray];
        int countArray =0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(typeOfEngine)) {
                newVehicle[countArray] = vehicle;
                countArray++ ;

            }

        }
        return newVehicle;
    }



}



