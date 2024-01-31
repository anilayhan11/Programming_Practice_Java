package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonth = Double.parseDouble(scanner.nextLine());

        double moneyEarned = 0.00;

        if (kmMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    moneyEarned = 4 * kmMonth * 0.75;
                    break;
                case "Summer":
                    moneyEarned = 4 * kmMonth * 0.90;
                    break;
                case "Winter":
                    moneyEarned = 4 * kmMonth * 1.05;
                    break;
                default:
                    System.out.println("Invalid season");
                    break;
            }
        } else if (kmMonth > 5000 && kmMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    moneyEarned = 4 * kmMonth * 0.95;
                    break;
                case "Summer":
                    moneyEarned = 4 * kmMonth * 1.10;
                    break;
                case "Winter":
                    moneyEarned = 4 * kmMonth * 1.25;
                    break;
                default:
                    System.out.println("Invalid season");
                    break;
            }
        } else if (kmMonth > 10000 && kmMonth <= 20000) {
            moneyEarned = 4 * kmMonth * 1.45;
        } else {
            System.out.println("Invalid km");
        }
        moneyEarned = moneyEarned * 0.90;

        System.out.printf("%.2f", moneyEarned);
    }
}
