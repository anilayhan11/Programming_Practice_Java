package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0.00;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carPrice = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carPrice = budget * 0.65;
                    break;
                default:
                    System.out.println("Invalid season");
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carPrice = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carPrice = budget * 0.80;
                    break;
                default:
                    System.out.println("Invalid season");
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 0.90;
        }

        System.out.printf("%s%n%s - %.2f", carClass, carType, carPrice);
    }
}
