package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.00;
        String location = "";
        String place = "";

        if (budget > 3000) {
            place = "Hotel";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.90;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.90;
                    break;
                default:
                    System.out.println("Invalid season");
                    break;
            }
        } else if (budget > 1000) {
            place = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.80;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.60;
                    break;
                default:
                    System.out.println("Invalid season");
                    break;
            }
        } else if (budget <= 1000) {
            place = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.45;
                    break;
                default:
                    System.out.println("Invalid season");
                    break;
            }

        }
        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
