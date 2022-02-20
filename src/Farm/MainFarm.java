package Farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFarm {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(21,2,"Male", "Masha");
        Sheep sheep1 = new Sheep(221,22,"Female", "Merlin");
        Sheep sheep3 = new Sheep(212,24,"Female", "Jack");


        Cow[] cowArray = {new Cow(200,3,"Male", "Morti"), new Cow(156,2,"Female", "Dorri"),
                new Cow(145.5,1, "Female", "Jack"), new Cow(120.5, 4, "Male", "Marushya"),
                        new Cow(134, 4, "Female", "Maria")};

        Horse[] horseArray = {new Horse("Black", 2300,4,"Male", "Zoro"), new Horse("Red",356,4,"Female", "Handsome")};

        Sheep[] sheepArray = {sheep, sheep1,sheep3};
        //Farm1
        System.out.println("Farm 1:");
        Farm farm1 = new Farm("Tokmok city", "Jack Olsan", sheepArray, cowArray, horseArray);
        System.out.println(farm1);
        //Farm2
        Sheep[] sheepArray2 = {new Sheep(22,3,"Male", "Dora")};
        Horse[] horseArrray2 = {new Horse("Yellow",221,22,"Female", "Joch")};
        Cow[] cowArray2 = {new Cow(212,24,"Female", "jayson")};

        System.out.println("Farm 2:");

        Farm farm2 = new Farm("Bishkek City Backer street", "Andrew Bekker", sheepArray2, cowArray2, horseArrray2);
        System.out.println(farm2);










        Horse horse = new Horse("White", 12,2, "Male", "Marusya");
        Horse horse2 = new Horse("Red", 12,2, "Male", "Santa");

        Horse[] horses = {horse, horse2};





    }
}
