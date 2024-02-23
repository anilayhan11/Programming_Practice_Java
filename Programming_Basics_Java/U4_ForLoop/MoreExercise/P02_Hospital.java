package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        int examinedPatients = 0;
        int unexaminedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (unexaminedPatients > examinedPatients) {
                    doctors++;
                }
            }

                if (patients <= doctors) {
                    examinedPatients += patients;
                } else {
                    examinedPatients += doctors;
                    unexaminedPatients += (patients - doctors);
                }

            }

        System.out.printf("Treated patients: %d.\n", examinedPatients);
        System.out.printf("Untreated patients: %d.\n", unexaminedPatients);
    }
}

