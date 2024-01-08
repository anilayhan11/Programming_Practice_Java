package Lab;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        int prod = 0;

        if (times > 10) {
            prod = n * times;
            System.out.printf("%d X %d = %d\n", n, times, prod);

        } else {
            for (int i = times; i <= 10; i++) {
                prod = n * i;
                System.out.printf("%d X %d = %d\n", n, i, prod);
            }
        }
    }
}
