import java.util.*;
public class PrimeNumbersN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int j;
        if (num1 <= num2) {
            System.out.println("Prime Numbers:");
            for (int i = num1; i <= num2; i++) {
                for (j = 2; j <= i; j++) {
                    if (i%j == 0) {
                        break;
                    }
                }
                if (i == j) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("first number must be greater than second number.");
        }
        scan.close();
    }
}
