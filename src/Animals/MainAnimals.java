package Animals;

public class MainAnimals {
    public static void main(String[] args) {
        //Conect to cat Class
        Cat cats = new Cat();
        cats.setcName("Tom");
        cats.setcKind("African");
        cats.setcAge(2);
        cats.checkCatData(); //Check data from user
        cats.getCatInfo(); // We can see all data with one get Method
        System.out.println();
        //Connect to dog class
        Dog dogs = new Dog();
        dogs.setdName("Rex");
        dogs.setdKind("German");
        dogs.setdAge(3);
        dogs.chechDogData(); //Check data from user
        dogs.etDogInfo(); // We can see all data with one get Method
        System.out.println();
        //Connect to Fish class
        Fish fish = new Fish();
        fish.setfName("Rusalka");
        System.out.println("Fish name is: " + fish.getfName());
        fish.setfKind("Forel");
        System.out.println("Fish Kind is: " + fish.getfKind());
        fish.setfSize(15);
        System.out.println("Fish size is: " + fish.getfSize());
        System.out.println();
        //Connect to Parrot class
        Parrot parrot = new Parrot();
        parrot.setpName("Arlando");
        System.out.println("Parrot name is: " + parrot.getpName());
        parrot.setpKind("Brazilian");
        System.out.println("Parrot Kind is: " + parrot.getpKind());
        parrot.setpAge(5);
        System.out.println("Parrot age is: " + parrot.getpAge());




    }
}
