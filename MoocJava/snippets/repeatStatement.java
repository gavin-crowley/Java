
import java.util.ArrayList;
import java.util.Scanner;


public class RepeatStatment {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

//        int index = numbers.size() - 1;
//        while (index >= 0) {
//            int number = numbers.get(index);
//            System.out.println(number);
//            index = index - 1;
//        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int number = numbers.get(i);
            System.out.println(number);
        }
    }
}