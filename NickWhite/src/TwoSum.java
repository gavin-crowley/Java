import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] testArray = {3,2,1,4,6};
        int target = 7;

        System.out.println(Arrays.toString(twoSumHashMap(testArray, target)));
//        System.out.println(Arrays.toString(twoSumBrute(testArray, target)));
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target-nums[i];
            if (hashmap.containsKey(diff)) {
                return new int[]{hashmap.get(diff),i};
            }
            hashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match found");
    }

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) continue;
                else {
                    if (nums[i] + nums[j]==target) {
                        return new int[]{i,j};
                    }
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}
