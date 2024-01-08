package L1_Lab;

import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 inch = 2.54 cm
        int inches = Integer.parseInt(scanner.nextLine());
        double cm = inches * 2.54;

        System.out.println(cm);

    }
}
