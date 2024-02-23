package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int counterCard = 0;
        int counterCash = 0;
        double cardEarnings = 0.00;
        double cashEarnings = 0.00;
        boolean isCollected = false;

        while (!input.equals("End")) {
            counter++;
            int currentPrice = Integer.parseInt(input);

            if (counter % 2 == 0) {
                if (currentPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    counterCard++;
                    cardEarnings += currentPrice;
                    System.out.println("Product sold!");
                }
            } else {
                if (currentPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    counterCash++;
                    cashEarnings += currentPrice;
                    System.out.println("Product sold!");
                }
            }
            if (cashEarnings + cardEarnings >= goal) {
                isCollected = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (isCollected) {
            double averageCash = cashEarnings / counterCash;
            double averageCard = cardEarnings / counterCard;
            System.out.printf("Average CS: %.2f\n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {

            System.out.println("Failed to collect required money for charity.");
        }
    }
}