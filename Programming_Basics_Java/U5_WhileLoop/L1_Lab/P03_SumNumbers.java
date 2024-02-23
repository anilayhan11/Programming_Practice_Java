package U5_Lists.L1_Lab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ultimateNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < ultimateNumber) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

        }

        System.out.println(sum);
    }
}
