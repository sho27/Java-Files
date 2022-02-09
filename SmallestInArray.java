public class SmallestInArray {
    public static void main(String args[]) {
        int arr[] = {9, 15, 4, 2, 25};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number of array elements :" + min);
    }
}
