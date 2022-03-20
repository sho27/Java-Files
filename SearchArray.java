public class SearchArray {
    public static void main(String args[]) {
        int a = 6, count = 0;
        int arr[] = {3, 6, 7, 9, 6, 2, 1, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                count += 1;
            } 
        }
        System.out.println("Number of repetition of specific number : " + count);
    }
}
