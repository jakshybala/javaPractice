package Circle;

public class Circle {
    static double pi = Math.PI;

    public static double area(double enterRadius) {
        return pi * (enterRadius * enterRadius);
    }

    public static double circumference(double enterRadius) {
        return pi * 2 * enterRadius;
    }
}
