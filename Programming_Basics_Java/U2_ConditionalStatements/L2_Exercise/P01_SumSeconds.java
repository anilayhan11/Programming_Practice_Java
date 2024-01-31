package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeTotal = timeFirst + timeSecond + timeThird;

        // because var type is int, the value after the decimal point is ignored.
        int minutes = timeTotal / 60;
        int seconds = timeTotal % 60;


        if (minutes < 10) {
            System.out.printf("%d:0%d", minutes, seconds);

        } else {
            System.out.printf("%d:%d", minutes, seconds);

        }
    }
}
