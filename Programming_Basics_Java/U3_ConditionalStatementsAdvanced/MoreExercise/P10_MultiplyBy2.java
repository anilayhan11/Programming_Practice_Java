package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputNum = Double.parseDouble(scanner.nextLine());
        double doubleNum = 0.00;

        while (inputNum >= 0) {
            doubleNum = inputNum * 2;

            System.out.printf("Result: %.2f\n", doubleNum);

            inputNum = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!\n");
    }
}
