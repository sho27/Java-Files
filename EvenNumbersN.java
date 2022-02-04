import java.util.*;
public class EvenNumbersN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 <= num2) {
            System.out.println("Even Numbers between " + num1 + " to " + num2);
            for (int i = num1; i <= num2; i++) {
                if (i%2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("first number must be less than second number");
        }
        scan.close();
    }
}