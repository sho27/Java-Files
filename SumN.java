import java.util.*;
public class SumN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Sum of " + num1 + " to " + num2 + " : " + sum);
        scan.close();
    }
}
