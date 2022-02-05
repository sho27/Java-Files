public class PrimeNumber {
    public static void main(String args[]) {
        int j;
        System.out.println("Prime Numbers:");
        for (int i = 1; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i%j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
