import java.util.*;
public class DataTypes{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer, Double and String");
        int i_integer = scan.nextInt();
        double d_double = scan.nextDouble();
        String s_string = scan.nextLine();
        System.out.println("Integer :" + i_integer);
        System.out.println("Double :" + d_double);
        System.out.println("String :" + s_string);
        scan.close();
    }
}
