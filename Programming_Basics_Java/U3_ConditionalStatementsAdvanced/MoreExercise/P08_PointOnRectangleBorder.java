package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class PointOnRectangleBorder_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ((y1 <= y && y2 >= y) && (x1 == x || x2 == x)) {
                System.out.println("Border");
        } else if ((x1 <= x && x2 >= x) && (y1 == y || y2 == y)) {
                System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}

