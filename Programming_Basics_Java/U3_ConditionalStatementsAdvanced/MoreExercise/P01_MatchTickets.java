package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberPeople = Integer.parseInt(scanner.nextLine());

        double moneyLeft = 0.00;
        double ticketMoney = 0.00;

        if (numberPeople >= 1 && numberPeople <= 4) {
            moneyLeft = budget * 0.25;
        } else if (numberPeople >= 5 && numberPeople <= 9) {
            moneyLeft = budget * 0.40;
        } else if (numberPeople >= 10 && numberPeople <= 24) {
            moneyLeft = budget * 0.50;
        } else if (numberPeople >= 25 && numberPeople <= 49) {
            moneyLeft = budget * 0.60;
        } else if (numberPeople >= 50) {
            moneyLeft = budget * 0.75;
        } else {
            System.out.println("Invalid number");
        }

        switch (category) {
            case "VIP":
                ticketMoney = 499.99 * numberPeople;
                break;
            case "Normal":
                ticketMoney = 249.99 * numberPeople;
                break;
            default:
                System.out.println("Invalid category");
                break;
        }

        if (ticketMoney < moneyLeft) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - ticketMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketMoney - moneyLeft);
        }
    }
}
