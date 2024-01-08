package MoreExercise;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Each bottle = 750 ml. of soap
        // 1 plate needs 5 ml. of soap
        // 1 saucepan needs 15 ml. of soap
        // The dishwasher is filled saucepans only every 3rd load. All others are dishes only.

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int detergentAvailable = bottles * 750;
        int saucepansCount = 0;
        int platesCount = 0;
        int loadCount = 0;

        while (!input.equals("End")) {
            int dishesCount = Integer.parseInt(input);
            loadCount++;

            if (loadCount % 3 == 0) {
                detergentAvailable -= dishesCount * 15;
                saucepansCount += dishesCount;
            } else {
                detergentAvailable -= dishesCount * 5;
                platesCount += dishesCount;
            }

            if (detergentAvailable < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentAvailable));
                return;
            }

            input = scanner.nextLine();
        }

            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", platesCount, saucepansCount);
            System.out.printf("Leftover detergent %d ml.", detergentAvailable);

    }
}
