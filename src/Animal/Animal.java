package Animal;

import java.util.Arrays;

public abstract class Animal {
    public static void allAnimalMethods() {
        Animal[] animals = {new Eagle(), new Shark(), new Turtle()};
        for (Animal countAnimal : animals) {
            if (countAnimal instanceof Shark) {
                ((Shark) countAnimal).attackMethod();
            }
            if (countAnimal instanceof Eagle) {
                ((Eagle) countAnimal).fly();
            }
            if (countAnimal instanceof Turtle) {
                ((Turtle) countAnimal).swim();
            }
        }
        Eagle[] eage = new Eagle[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Shark[] sharks = new Shark[animals.length];
        int eagleCount = 0;
        int sharkCount = 0;
        int turtleCount = 0;
        for (Animal count : animals) {
            if (count instanceof Eagle) {
                eage[eagleCount] = new Eagle();
                eagleCount ++;
            }
            if (count instanceof Shark){
                sharks[sharkCount] = new Shark();
                sharkCount ++;
            }
            if (count instanceof Turtle) {
                turtles[turtleCount] = new Turtle();
                turtleCount ++;
            }
            //System.out.println("count test " + count);
        }
        System.out.println("Eagle Array " + Arrays.toString(eage));
        System.out.println("Shark Array " + Arrays.toString(sharks));
        System.out.println("Turle Array " + Arrays.toString(turtles));

    }
}


