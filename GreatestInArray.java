public class GreatestInArray {
    public static void main(String args[]) {
        int arr[] = {89, 115, 74, 92, 45};
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("Greatest number of array elements :" + large);
    }
}
