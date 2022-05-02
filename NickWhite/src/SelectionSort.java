public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,4,7,1,9,3};

        selectionSort(nums);
    }

    public static void selectionSort(int[] arr) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int k=0; k<arr.length; ++k)
            System.out.print(arr[k]+" ");
        System.out.println();
    }



}
