package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failedTaskAvailability = Integer.parseInt(scanner.nextLine());
        int failedTasks = 0;
        int tasks = 0;
        double totalGrades = 0.00;
        String lastProblem = "";

        String taskName = scanner.nextLine();

        while (!taskName.equals("Enough")) {
            int mark = Integer.parseInt(scanner.nextLine());
            tasks++;
            totalGrades += mark;

            if (mark <= 4) {
                failedTasks++;

                if (failedTasks == failedTaskAvailability) {
                    System.out.printf("You need a break, %d poor grades.", failedTasks);
                    return;
                }
            }

            lastProblem = taskName;
            taskName = scanner.nextLine();
        }
        System.out.printf("Average score: %.2f\n", totalGrades / tasks);
        System.out.printf("Number of problems: %d\n", tasks);
        System.out.printf("Last problem: %s\n", lastProblem);
    }
}
