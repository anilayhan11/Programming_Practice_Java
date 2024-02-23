package U5_Lists.L1_Lab;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    System.out.printf("%.2f", 2.50 * amount);
                } else if (fruit.equals("apple")) {
                    System.out.printf("%.2f", 1.20 * amount);
                } else if (fruit.equals("orange")) {
                    System.out.printf("%.2f", 0.85 * amount);
                } else if (fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", 1.45 * amount);
                } else if (fruit.equals("kiwi")) {
                    System.out.printf("%.2f", 2.70 * amount);
                } else if (fruit.equals("pineapple")) {
                    System.out.printf("%.2f", 5.50 * amount);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", 3.85 * amount);
                } else {
                    System.out.println("error");
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    System.out.printf("%.2f", 2.70 * amount);
                } else if (fruit.equals("apple")) {
                    System.out.printf("%.2f", 1.25 * amount);
                } else if (fruit.equals("orange")) {
                    System.out.printf("%.2f", 0.90 * amount);
                } else if (fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", 1.60 * amount);
                } else if (fruit.equals("kiwi")) {
                    System.out.printf("%.2f", 3.00 * amount);
                } else if (fruit.equals("pineapple")) {
                    System.out.printf("%.2f", 5.60 * amount);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", 4.20 * amount);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
