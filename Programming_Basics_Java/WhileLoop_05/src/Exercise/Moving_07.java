package Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int spaceVol = width * length * height;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxesCount = Integer.parseInt(input);
            spaceVol -= boxesCount;

            if (spaceVol <= 0) {

                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(spaceVol));
                break;
            }
            input = scanner.nextLine();
        }
        if (spaceVol >= 0) {
            System.out.printf("%d Cubic meters left.", spaceVol);
        }
    }
}
