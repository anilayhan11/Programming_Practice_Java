package MoreExercise;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - freeDays;

        int freeDaysPlay = freeDays * 127;
        int workDaysPlay = workDays * 63;
        int totalPlayMin = freeDaysPlay + workDaysPlay;

        int extraPlay = totalPlayMin - 30000;
        int missingPlay = 30000 - totalPlayMin;

        if (totalPlayMin > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", (extraPlay / 60), (extraPlay % 60));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (missingPlay / 60), (missingPlay % 60));
        }

    }
}
