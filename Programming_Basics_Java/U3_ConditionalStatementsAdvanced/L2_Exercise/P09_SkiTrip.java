package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stayDays = Integer.parseInt(scanner.nextLine());
        String spaceType = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0;

        switch (spaceType) {
            case "room for one person":
                price = 18.00 * (stayDays - 1);
                break;
            case "apartment":
                if (stayDays >= 0) {
                    if (stayDays > 15) {
                        price = 25.00 * (stayDays - 1) * 0.50;
                    } else if (stayDays >= 10) {
                        price = 25.00 * (stayDays - 1) * 0.65;
                    } else {
                        price = 25.00 * (stayDays - 1) * 0.70;
                    }
                } else {
                    System.out.println("error");
                }
                break;
            case "president apartment":
                if (stayDays >= 0) {
                    if (stayDays > 15) {
                        price = 35.00 * (stayDays - 1) * 0.80;
                    } else if (stayDays >= 10) {
                        price = 35.00 * (stayDays - 1) * 0.85;
                    } else {
                        price = 35.00 * (stayDays - 1) * 0.90;
                    }
                } else {
                    System.out.println("error");
                }
                break;
        }
        if (review.equals("positive")) {
            price = price * 1.25;
        } else if (review.equals("negative")) {
            price = price * 0.90;
        } else {
            System.out.println("error");
        }

        System.out.printf("%.2f", price);
    }
}
