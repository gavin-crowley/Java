import java.util.ArrayList;
import java.util.Arrays;

public class MultipleOfIndex {
    public static void main(String[] args) {

        int[] array = {2,1,4,5,25,36};

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                temp.add(array[i]);
            }
        }
        System.out.println(temp);
        System.out.println(temp.getClass());

        int[] done = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            done[i] = temp.get(i);
        }
//        return done;
        System.out.println(Arrays.toString(done));
        System.out.println(done.getClass().getComponentType());

    }
}
