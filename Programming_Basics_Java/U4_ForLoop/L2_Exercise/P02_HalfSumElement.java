package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumberFound = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if (currentNumber > maxNumberFound) {
                maxNumberFound = currentNumber;
            }
        }
        if (maxNumberFound == sum - maxNumberFound) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumberFound);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumberFound - (sum - maxNumberFound)));
        }
    }
}