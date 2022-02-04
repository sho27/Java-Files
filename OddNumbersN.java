import java.util.*;
public class OddNumbersN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Odd Numbers between " + num1 + " to " + num2);
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                if (i%2 != 0) {
                    System.out.println(i);
                }
            }
        }
        scan.close();
    }
}
