package Profession;

public class MainProfession {
    public static void main(String[] args) {
        //Connect to Dancer class
        Dancer dancer = new Dancer("Anna", "Dancer", "Tango");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        System.out.println("__________________");
        //Connecting to Programmer class
        Programmer coder = new Programmer("Azamat","Coding", "Google");
        System.out.println(coder);
        coder.learn();
        coder.eat();
        coder.walk();
        coder.coding();
        System.out.println("__________________");
        //Connect to Singer class
        Singer singer = new Singer("Jackson", "Singing", "Black and Yellow" );
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGitar();

    }
}
