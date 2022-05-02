import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {
        int[] nums = {2,5,3,4,9,7,7};
        System.out.println(isUniqueHashMap(nums));
//        System.out.println(isUnqiueBrute(nums));
    }



    public static boolean isUniqueHashMap(int[] nums) {
        HashSet<Integer> foundNumbers = new HashSet();
        for (int num : nums) {
            if(foundNumbers.contains(num)){
                return false;
            }
            foundNumbers.add(num);
        }
        return true;
    }


    public static boolean isUnqiueBrute(int[] nums) {
        boolean foundDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    foundDuplicate = true;
                    return false;
                }
            }
        }
        return true;
    }


//    public static boolean isUniqueHashMap(int[] nums) {
//        HashMap<Integer, Integer> num_occurances = new HashMap();
//        for (int num : nums) {
//            num_occurances.put(num, num_occurances.getOrDefault(num,0) + 1);
//        }
//        HashSet<Integer> unique_vals = new HashSet(num_occurances.values());
//        return num_occurances.size() == unique_vals.size();
//    }




}