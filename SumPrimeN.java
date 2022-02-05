import java.util.*;
public class SumPrimeN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int j, sum = 0;
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                for (j = 2; j <= i; j++) {
                    if (i%j == 0) {
                        break;
                    }
                }
                if (i == j) {
                    sum += i;
                }
            }
            System.out.println("Sum of Prime Numbers between " + num1 + " to " + num2 + " : " + sum);
        } else {
            System.out.println("first number must be greater than second number.");
        }
        scan.close();
    } 
}
