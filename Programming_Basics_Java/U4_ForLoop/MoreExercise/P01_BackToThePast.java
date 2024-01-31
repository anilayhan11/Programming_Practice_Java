package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double spentMoney = 0.00;
        int age = 17;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                age++;
                spentMoney += 12000;
            } else {
                age++;
                spentMoney += 12000 + 50 * age;
            }
        }

        if (inheritance >= spentMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", (inheritance - spentMoney));
        } else {
            System.out.printf("He will need %.2f dollars to survive.", (spentMoney - inheritance));
        }
    }
}
