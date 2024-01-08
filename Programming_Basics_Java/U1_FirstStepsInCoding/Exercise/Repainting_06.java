package Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.10)) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double materialsPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workersPrice = workHours * materialsPrice * 0.30;

        System.out.println(materialsPrice + workersPrice);

    }
}
