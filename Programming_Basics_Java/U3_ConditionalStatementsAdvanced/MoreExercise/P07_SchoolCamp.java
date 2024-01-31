package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberStay = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        String sportType = "";

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        price = 9.60 * numberStay * numberStudents;
                        sportType = "Judo";
                        break;
                    case "girls":
                        price = 9.60 * numberStay * numberStudents;
                        sportType = "Gymnastics";
                        break;
                    case "mixed":
                        price = 10.00 * numberStay * numberStudents;
                        sportType = "Ski";
                        break;
                    default:
                        System.out.println("Invalid group type");
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        price = 7.20 * numberStay * numberStudents;
                        sportType = "Tennis";
                        break;
                    case "girls":
                        price = 7.20 * numberStay * numberStudents;
                        sportType = "Athletics";
                        break;
                    case "mixed":
                        price = 9.50 * numberStay * numberStudents;
                        sportType = "Cycling";
                        break;
                    default:
                        System.out.println("Invalid group type");
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        price = 15.00 * numberStay * numberStudents;
                        sportType = "Football";
                        break;
                    case "girls":
                        price = 15.00 * numberStay * numberStudents;
                        sportType = "Volleyball";
                        break;
                    case "mixed":
                        price = 20.00 * numberStay * numberStudents;
                        sportType = "Swimming";
                        break;
                    default:
                        System.out.println("Invalid group type");
                        break;
                }
                break;
        }

        if (numberStudents >= 50) {
            price = price * 0.50;
        } else if (numberStudents >= 20) {
            price = price * 0.85;
        } else if (numberStudents >= 10) {
            price = price * 0.95;
        }

        System.out.printf("%s %.2f lv.", sportType, price);

    }
}
