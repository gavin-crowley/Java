
public class ArrayPlusArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println(addArrayElements(arr1) + addArrayElements(arr2));
    }

    public static int addArrayElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}

//
//public class Sum {
//
//    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        int arrSum = 0;
//        for(int num : arr1) {arrSum += num;}
//        for(int num : arr2) {arrSum += num;}
//        return arrSum;
//    }
//
//}

