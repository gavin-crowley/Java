import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class C1_P1_CountDuplicateCharacters {
    public static void main(String[] args) {
        String str = "asdfghjklaf";
        System.out.println(countDuplicateCharactersV1(str));
        System.out.println(countDuplicateCharactersV2(str));
    }


    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (key, val) -> (val == null) ? 1 : ++val);
        }

        return result;
    }


//https://www.geeksforgeeks.org/hashmap-compute-method-in-java-with-examples/

//==============================================

    public static Map<Character, Long> countDuplicateCharactersV2(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }

}