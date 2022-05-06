import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class SumOfDifferences {
    public static void main(String[] args) {

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(1);
//        arr.add(10);
//        System.out.println(arr);
//        Collections.sort(arr, Collections.reverseOrder());
//        System.out.println(arr
//        );
//
//        int sum = 0;
//        for (int i = 0; i < arr.toArray().length-1; i++) {
//            sum += arr.get(i) - arr.get(i + 1);
//        }
//
//        System.out.println(sum);
        int[] arr = {2,1,10};

        System.out.println(sumOfDifferences(arr));
    }

    public static int sumOfDifferences(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < list.toArray().length - 1; i++) {
            sum += list.get(i) - list.get(i + 1);
        }
        return sum;
    }
}
