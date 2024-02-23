package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

// Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
// Използвайте формулата за лице на триъгълник: area = a * h / 2.
// Форматирате изхода до втория знак след десетичната запетая.
public class TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
