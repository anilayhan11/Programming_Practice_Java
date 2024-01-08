package L2_Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        // Calculate order price
        // ⦁ Пъзел - 2.60 лв.
        // ⦁ Говореща кукла - 3 лв.
        // ⦁ Плюшено мече - 4.10 лв.
        // ⦁ Миньон - 8.20 лв.
        // ⦁ Камионче - 2 лв.

        double orderPrice = (puzzles * 2.60) + (dolls * 3.00) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2.00);

        // Check if toys are more than 50, add 25% discount
        int toysCount = puzzles + dolls + teddyBears + minions + trucks;

        if (toysCount >= 50) {
            orderPrice = orderPrice * 0.75;
        }

        // Subtract 10% for store rent
        orderPrice = orderPrice * 0.90;

        if (orderPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", (orderPrice - tripPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (tripPrice - orderPrice));

        }
    }
}
