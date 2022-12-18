import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // timecomplexity o(n^2) is done
        int arr[] = { 5,7,2,9,10,14,4};
        System.out.println(" Elements in Array Before Sorting : " + Arrays.toString(arr));

        int n=arr.length;

        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {

                if (arr[j] > arr[j+1])
                {
                        int temp= arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }


        }

        System.out.println(" Elements in Array After Sorting : " + Arrays.toString(arr));
    }
}
