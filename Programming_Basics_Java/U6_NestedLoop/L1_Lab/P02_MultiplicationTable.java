package L1_Lab;

public class MultiplicationTable_02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int k = 1; k <= 10; k++) {
                System.out.printf("%d * %d = %d%n", i, k, i * k);
            }
        }
    }
}

