public class SumPrime {
    public static void main(String args[]) {
        int j;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i%j == 0) {
                    break;
                }
            }
            if (i == j) {
                sum += i;
            }
        }
        System.out.println("Sum of Prime Numbers between 1 to 100: " + sum);
    }
}
