public class SecondGreatest {
    public static void main(String args[]) {
        int arr[] = {89, 15, 54, 192, 145};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Greatest number of array elements :" + arr[1]);
    } 
}
