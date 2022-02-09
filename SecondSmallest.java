public class SecondSmallest {
    public static void main(String args[]) {
        int arr[] = {9, 15, 54, 12, 35};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest number of array elements :" + arr[1]);
    } 
}
