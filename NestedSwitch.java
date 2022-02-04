public class NestedSwitch {
    public static void main(String args[]) {
        int num1 = 1, num2 = 5;
        switch(num1) {
            case 1: switch(num2) {
                        case 5 : System.out.println("one and five");
                            break;
                        case 6: System.out.println("one and six");
                            break;
            }
                break;
            case 2: System.out.println("two");
                break;
            default: System.out.println("No Match");
        }
    }
}
