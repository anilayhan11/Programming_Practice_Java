package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int numberRaters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberRaters; i++) {

            String raterName = scanner.nextLine();
            double pointsRater = Double.parseDouble(scanner.nextLine());

            pointsAcademy += raterName.length() * pointsRater / 2;

            if (pointsAcademy > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsAcademy);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - pointsAcademy);


    }
}
