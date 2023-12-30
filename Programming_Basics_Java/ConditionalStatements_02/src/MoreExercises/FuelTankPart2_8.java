package MoreExercises;

import java.util.Scanner;

public class FuelTankPart2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String isMember = scanner.nextLine();

        double price = 0.00;

        switch (fuelType) {
            case "Gas":
                if (isMember.equals("Yes")) {
                    price = (0.93 * litersFuel) - (0.08 * litersFuel);
                } else {
                    price = 0.93 * litersFuel;
                }
                break;
            case "Gasoline":
                if (isMember.equals("Yes")) {
                    price = (2.22 * litersFuel) - (0.18 * litersFuel);
                } else {
                    price = 2.22 * litersFuel;
                }
                break;
            case "Diesel":
                if (isMember.equals("Yes")) {
                    price = (2.33 * litersFuel) - (0.12 * litersFuel);
                } else {
                    price = 2.33 * litersFuel;
                }
                break;
            default:
        }
        if (litersFuel > 25) {
            price = price * 0.90;
        } else if (litersFuel >= 20) {
            price = price * 0.92;
        }

        System.out.printf("%.2f lv.", price);
    }
}
