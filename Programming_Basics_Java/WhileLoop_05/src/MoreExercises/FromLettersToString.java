package MoreExercises;

import java.util.Scanner;

public class FromLettersToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String word = "";

        while (!input.equals("End")) {

            word += input;

            input = scanner.nextLine();
        }
        System.out.print(word);
    }
}
