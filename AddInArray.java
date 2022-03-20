6import java.util.*;
public class AddInArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number of elements in an array");
        int len = scan.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[len+1];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the position where we want to add new element");
        int pos = scan.nextInt();
        System.out.println("Enter new element");
        int num = scan.nextInt();
        for(int i = len; i >= pos; i--){
            arr[i] = arr[i-1]; 
        }
        arr[pos] = num;
        System.out.println("Print Elements");
        for (int i = 0; i <= len; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
