package U5_Lists.L1_Lab;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int position = 0; position < input.length(); position++) {
            char letter = input.charAt(position);
            System.out.println(letter);
        }
    }
}
