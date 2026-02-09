package carsquestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class CarsQuestion {

    //arraylist 
    static ArrayList<Cars> carList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Cars> favoriteList = new ArrayList<>();

    public static void read() throws FileNotFoundException {
        File myFile = new File("cars.txt");
        Scanner inputFile = new Scanner(myFile);
        //reading data from file 
        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            String[] parts = line.split(",");
            Cars car = new Cars(
                    parts[0].trim(),
                    parts[1].trim(),
                    Integer.parseInt(parts[2].trim()),
                    parts[3].trim(),
                    parts[4].trim(),
                    Integer.parseInt(parts[5].trim()),
                    Double.parseDouble(parts[6].trim())
            );
            carList.add(car);
        }
        inputFile.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        read();
//        for(Cars c : carList) {
//                System.out.println(c.toString());
//            }
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("A. Display cars information");
            System.out.println("B. Add / Delete / Search for a car");
            System.out.println("C. My favorite list");
            System.out.println("D. Exit");
            System.out.print("Choice: ");
            String choice = input.next().toUpperCase();

            switch (choice) {
                case "A":
                    menuA();
                    break;
                case "B":
                    menuB();
                    break;
                case "C":
                    menuC();
                    break;
                case "D":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }

    public static void menuA() {
        System.out.println("1. Display by Brand\n2. Display by Fuel\n3. Display by Year\n4. Display by Gear\n5. Back");
        int choice = input.nextInt();
        System.out.print("Enter value to search for: ");
        String value = input.next();

        for (Cars c : carList) {
            boolean match = false;
            if (choice == 1 && c.getCarBrand().equalsIgnoreCase(value)) {
                match = true;
            }
            if (choice == 2 && c.getCarFuelType().equalsIgnoreCase(value)) {
                match = true;
            }
            if (choice == 3 && c.getCarYear() == Integer.parseInt(value)) {
                match = true;
            }
            if (choice == 4 && c.getCarGearType().equalsIgnoreCase(value)) {
                match = true;
            }

            if (match) {
                System.out.println(c);
            }
        }
    }

    public static void menuB() {
        System.out.println("1. Add new car\n2. Delete car\n3. Search\n4. Back");
        int choice = input.nextInt();
        if (choice == 1) {

            System.out.println("Enter ID, Brand, Year, Fuel, Gear, Doors, Price:");
            carList.add(new Cars(input.next(), input.next(), input.nextInt(), input.next(), input.next(), input.nextInt(), input.nextDouble()));
        } else if (choice == 2) {
            System.out.print("Enter ID to delete: ");
            String id = input.next();
            for (int i = 0; i < carList.size(); i++) {
                if (carList.get(i).getCarID().equalsIgnoreCase(id)) {
                    carList.remove(i);
                }
            }
        } else if (choice == 3) {
            System.out.print("Enter ID to search for: ");
            String id = input.next();
            for (Cars c : carList) {
                if (c.getCarID().equalsIgnoreCase(id)) {
                    System.out.println("Car Found: " + c);
                    return;
                }
            }
            System.out.println("Car not found.");
        }
    }

    public static void menuC() {
        System.out.println("1. Add to favorites\n2. Display favorites\n3. Remove from favorites\n4. Back");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter Car ID to favorite: ");
            String id = input.next();
            for (Cars c : carList) {
                if (c.getCarID().equalsIgnoreCase(id)) {
                    favoriteList.add(c);
                }
            }
        } else if (choice == 2) {
            favoriteList.forEach(System.out::println);
        }
    }

}
