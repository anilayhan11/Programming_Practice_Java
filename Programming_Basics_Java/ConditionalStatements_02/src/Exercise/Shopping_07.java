package Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = 250 * videoCards;
        double priceProcessors = (priceVideoCards * 0.35) * processors;
        double priceRam = (priceVideoCards * 0.10) * ram;

        double purchase = priceVideoCards + priceProcessors + priceRam;

        if (videoCards > processors) {
            purchase = purchase * 0.85;
        }

        if (budget >= purchase) {
            System.out.printf("You have %.2f leva left!", (budget - purchase));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", (purchase - budget));
        }
    }
}
