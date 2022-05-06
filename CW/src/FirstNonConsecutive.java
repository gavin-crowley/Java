public class FirstNonConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};

        System.out.println(firstNonConsecutive(arr));
    }

    public static Integer firstNonConsecutive(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != 1) {
                return arr[i + 1];
            }
        }
        return null;
    }
}
