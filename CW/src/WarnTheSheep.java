import java.util.Arrays;

public class WarnTheSheep {
    public static void main(String[] args) {
        String[] arr = {"wolf", "sheep", "sheep", "sheep", "sheep", "sheep"};

        System.out.println(warnTheSheep(arr));
    }

    public static String warnTheSheep(String[] array) {
        int wolfN = Arrays.asList(array).indexOf("wolf") + 1;
        return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
    }
}