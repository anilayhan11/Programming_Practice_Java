package Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());

        // Decor = 10% of the budget
        // If actors are more than 150, 10% discount

        double decor = budget * 0.10;
        double costumePrice = actors * pricePerCostume;

        if (actors > 150) {
            costumePrice = costumePrice - (costumePrice * 0.10);
        }

        // How much will the movie cost
        double moviePrice = decor + costumePrice;

        // Will the budget be enough for the movie?
        if (moviePrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", (budget - moviePrice));
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (moviePrice - budget));
        }
    }
}
