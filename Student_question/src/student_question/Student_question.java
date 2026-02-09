package student_question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class Student_question {

    static ArrayList< Student> students = new ArrayList<>();

    public static void read() throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Students.txt"));
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("[:/, ]+");

            String id = parts[0].trim();
            String name = parts[1].trim() + " " + parts[2].trim();
            String street = parts[3].trim() + " " + parts[4].trim();
            String city = parts[5].trim();
            String post = parts[6].trim();
            int day = Integer.parseInt(parts[7].trim());
            int month = Integer.parseInt(parts[8].trim());
            int year = Integer.parseInt(parts[9].trim());
            Student student = new Student(id, name, new Address(street, city, post), new Date(day, month, year));
            students.add(student);
        }
        fileScanner.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        read();
        Scanner input = new Scanner(System.in);
        char choice;

        System.out.println("***Menu***");
        System.out.println("A.Display all Students Info");
        System.out.println("B. Display the students who live in the same City");
        System.out.println("c.Students with Same Birth Day & Month");
        System.out.println("E. Exit");
        System.out.println("Enter your choice: ");
        choice = input.next().toUpperCase().charAt(0);
        switch (choice) {
            case 'A':

                displayInfo(students);
                break;

            case 'B':
                System.out.print("Enter City Name: ");
                input.nextLine();
                String city = input.nextLine();
                displayByCity(students, city);
                break;

            case 'C':

                displaySameBirthday(students);
                break;
            case 'E':
                System.out.println("Exiting Program...");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

    }

    // all students
    public static void displayInfo(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println("ID: " + s.getStdId() + " | Name: " + s.getStdName()
                    + " | City: " + s.getStdAddress().getCityName()
                    + " | Birthday: " + s.getBirthdate());
        }
    }

    // students according to city
    public static void displayByCity(ArrayList<Student> list, String city) {
        for (Student s : list) {
            if (s.getStdAddress().getCityName().equalsIgnoreCase(city)) {
                System.out.println(s.getStdName());
            }
        }
    }

    // student with the same birthday
    public static void displaySameBirthday(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Date d1 = list.get(i).getBirthdate();
                Date d2 = list.get(j).getBirthdate();
                if (d1.getBirthDay() == d2.getBirthDay() && d1.getBirthMonth() == d2.getBirthMonth()) {
                    System.out.println(list.get(i).getStdName() + " and " + list.get(j).getStdName()+" Birthday: "+list.get(i).getBirthdate());
                }
            }
        }
    }

    public static Student copyObjectOut(Student s) {
        return new Student(s.getStdId(), s.getStdName(), s.getStdAddress(), s.getBirthdate());
    }

    public static boolean checkEqualityOut(Student s1, Student s2) {
        return s1.getStdId().equals(s2.getStdId());
    }

}
