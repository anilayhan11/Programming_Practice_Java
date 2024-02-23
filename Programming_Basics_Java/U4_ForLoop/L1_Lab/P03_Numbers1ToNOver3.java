package U5_Lists.L1_Lab;

import java.util.Scanner;

public class Numbers1ToNOver3_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number += 3) { //със стъпка
            System.out.println(number);

        }
    }
}
