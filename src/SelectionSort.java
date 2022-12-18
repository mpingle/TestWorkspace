import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = { 7,8,3,1,2};
        // Time complexity O(n^2)
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int smallest =i;
            for (int j=i+1;j<n;j++){
                if (arr[smallest] > arr[j]){
                     smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        System.out.println( " Sorted array - selection sort" + Arrays.toString(arr));
    }
}
