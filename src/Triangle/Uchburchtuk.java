package Triangle;

public class Uchburchtuk {
    int a, b, c;

    public void areaMethod() {
        double perimetr = a + b + c;
        double poluperimert = perimetr / 2;
        System.out.println(Math.sqrt(poluperimert * (poluperimert - a) * (poluperimert - b) * (poluperimert - c)));

    }

    //Return method
    public double areaReturnMethod(double x, double y, double z) {
        double perimetr = x + y + z;
        double poluperimert = perimetr / 2;
        return Math.sqrt(poluperimert * (poluperimert - x) * (poluperimert - y) * (poluperimert - z));
    }

}



