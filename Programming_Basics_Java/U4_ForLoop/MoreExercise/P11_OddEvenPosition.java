package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class OddEvenPosition_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCount = Double.parseDouble(scanner.nextLine());

        double evenSum = 0.00;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE; // because Double.MIN_VALUE is a positive number,
        double oddSum = 0.00;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE; // but Integer.MIN_VALUE is negative.

        for (int i = 1; i <= inputCount; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNum;
                if (currentNum < evenMin) {
                    evenMin = currentNum;
                }
                if (currentNum > evenMax) {
                    evenMax = currentNum;
                }
            } else {
                oddSum += currentNum;
                if (currentNum < oddMin) {
                    oddMin = currentNum;
                }
                if (currentNum > oddMax) {
                    oddMax = currentNum;
                }
            }
        }

        if (oddMin == Double.MAX_VALUE || oddMax == Double.MIN_VALUE) {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.print("OddMin=No,\n");
            System.out.print("OddMax=No,\n");
        } else {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }

        if (evenMin == Double.MAX_VALUE || evenMax == Double.MIN_VALUE) {
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.print("EvenMin=No,\n");
            System.out.print("EvenMax=No\n");
        } else {
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.printf("EvenMin=%.2f,\n", evenMin);
            System.out.printf("EvenMax=%.2f\n", evenMax);
        }
    }
}
