public class AverageArray {
    public static void main(String args[]) {
        int arr[] = {10, 55, 16, 23, 95};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of array elements : " + avg);
    }
}
