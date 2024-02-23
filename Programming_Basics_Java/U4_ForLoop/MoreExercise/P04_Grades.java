package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int goodStudents = 0;
        int averageStudents = 0;
        int weakStudents = 0;
        double totalGrades = 0.00;

        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;

            if (grade >= 5.00) {
                topStudents++;
            } else if (grade >= 4.00) {
                goodStudents++;
            } else if (grade >= 3.00) {
                averageStudents++;
            } else {
                weakStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", topStudents * 1.00 / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudents * 1.00 / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", averageStudents * 1.00 / studentsCount * 100);
        System.out.printf("Fail: %.2f%%\n", weakStudents * 1.00 / studentsCount * 100);
        System.out.printf("Average: %.2f\n", totalGrades / studentsCount);
    }
}
