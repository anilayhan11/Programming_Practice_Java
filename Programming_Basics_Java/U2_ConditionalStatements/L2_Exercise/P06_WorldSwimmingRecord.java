package L2_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        // Calculate the time needed to swim through the whole pool
        double swimmingTimeInSeconds = distanceInMeters * timeInSecondsPerMeter;

        // For every 15 meters, he is slowed down by 12.5
        // We have to round down the times he slows down

        double delayedTimes = Math.floor(distanceInMeters / 15);
        swimmingTimeInSeconds = swimmingTimeInSeconds + (delayedTimes * 12.5);

        if (swimmingTimeInSeconds < worldRecordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTimeInSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTimeInSeconds - worldRecordInSeconds);
        }
    }
}
