public class IfStatement {
    public static void main(String args[]) {
        int num = 5, num1 = 8;

        //if statement
        if (true) {
            System.out.println("Welcome!");
        }

        //if else statement
        if (num%2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        //Ladder if statement
        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else {
            System.out.println("No match");
        }

        //Nested if statement
        if (num == 5) {
            if (num1 == 6) {
                System.out.println("Hello!");
            }
            else {
                System.out.println("Bye!");
            }
        }
    }
}
