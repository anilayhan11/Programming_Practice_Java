package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        int totalPeople = 0;

        for (int i = 1; i <= groupsCount; i++) {

            int peopleCount = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleCount;

            if (peopleCount <= 5) {
                musala += peopleCount;
            } else if (peopleCount <= 12) {
                montblanc += peopleCount;
            } else if (peopleCount <= 25) {
                kilimandjaro += peopleCount;
            } else if (peopleCount <= 40) {
                k2 += peopleCount;
            } else {
                everest += peopleCount;
            }
        }

        System.out.printf("%.02f%%\n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%\n", montblanc * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%\n", kilimandjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%\n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%\n", everest * 1.0 / totalPeople * 100);
    }
}
