public class ArraySum {
    public static void main(String args[]) {
        int arr[] = {10, 55, 16, 23, 95};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements : " + sum);
    }
}
