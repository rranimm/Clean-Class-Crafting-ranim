package geometrycalculator;

import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class GeometryCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Geometry geometry = new Geometry();

        // declaring variables
        int choice = 0;
        double radius = 0;
        double length = 0;
        double width = 0;
        double base = 0;
        double height = 0;

        //prompting the user for input
        System.out.println("Geometry Calculator.");
        System.out.println("1. Calculate the Area of a Circle. ");
        System.out.println("2. Calculate the Area of a Rectangle. ");
        System.out.println("3. Calculate the Area of a Triangle. ");
        System.out.println("4. Quit. ");
        System.out.println("Enter your choice (1-4): ");
        choice = input.nextInt();

        //responding 
        switch (choice) {
            case 1:
                System.out.println("Enter the radius: ");
                radius = input.nextDouble();
                if (isPositive(radius)) {
                    System.out.printf("The area of the circle = %.2f", Geometry.circleArea(radius));
                    break;
                } else {
                    System.out.println("Invalid input!");
                }
                break;

            case 2:
                System.out.println("Enter the length: ");
                length = input.nextDouble();
                System.out.println("Enter the width; ");
                width = input.nextDouble();
                if(isPositive(length)&&isPositive(width)){
                System.out.printf("The area of the rectangle = %.2f", Geometry.rectangleArea(length, width));
                break;
                }else {
                    System.out.println("Invalid input! ");
                }
                
            case 3:
                System.out.println("Enter the height: ");
                height = input.nextDouble();
                System.out.println("Enter the base; ");
                base = input.nextDouble();
                if(isPositive(height)&&isPositive(base)){
                System.out.printf("The area of the triangle = %.2f", Geometry.triangleArea(height, base));
                break;
                }else {
                    System.out.println("Invalid input!");
                    break;
                }
            case 4:
                break;
        }
    }

    public static boolean isPositive(double num) {
        boolean status = true;
        if (num > 0) {
            status = true;
        } else if (num < 0) {
            status = false;
        }

        return status;

    }
}
