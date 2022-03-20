import java.util.*;
public class DeleteInArray {
    public static void main(String args[]) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter 10 elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Element to be deleted");
        int del = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (del == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            } 
        }
        
        System.out.println("After deletion, new array is : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
