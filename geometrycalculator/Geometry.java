package geometrycalculator;

/**
 *
 * @author Ranim
 */
public class Geometry {

    private static final double PI = Math.PI;

    public static double circleArea(double r) {
        return PI * Math.pow(r, 2);
    }

    public static double rectangleArea(double w, double l) {
        return w * l;
    }

    public static double triangleArea(double b, double h) {
        return b * h * 0.5;
    }

}
