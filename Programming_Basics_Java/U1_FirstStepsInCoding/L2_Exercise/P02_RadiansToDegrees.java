package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // degrees = radians * 180 / Pi

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);

    }
}
