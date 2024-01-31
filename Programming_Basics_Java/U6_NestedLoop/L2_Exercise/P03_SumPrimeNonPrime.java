package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        String input = scanner.nextLine();

        while (!input.equals("stop")) {

            int number = Integer.parseInt(input); // turn string into int.

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {

                boolean isPrime = true;

                for (int divisor = 2; divisor <= number -1 ; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    sumPrime += number;
                } else {
                    sumNonPrime += number;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d\n", sumNonPrime);
    }
}
