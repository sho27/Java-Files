import java.util.*;
public class SumOddN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                if (i%2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of Odd Numbers between " + num1 + " to " + num2 + " : " + sum);
        } else {
            System.out.println("first number must be less than second number");
        }
        scan.close();
    }
}
