package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double birthdayMoney = 10.00;
        double lilyMoney = 0.00;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                lilyMoney += birthdayMoney;
                birthdayMoney += 10.00;
                lilyMoney -= 1;
            } else {
                toys++;
            }
        }
        lilyMoney += toys * toyPrice;

        if (lilyMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", lilyMoney - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - lilyMoney);
        }
    }
}
