import java.util.*;
public class DataTypes{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer, Double and String");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        System.out.println("Integer :" + i);
        System.out.println("Double :" + d);
        System.out.println("String :" + s);
        scan.close();
    }
}
