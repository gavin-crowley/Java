import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {

//        Java Array
        int[] numbers;
        numbers = new int[20];
        // adding
        numbers[0] = 10;
        // retrieval
        System.out.println(numbers[0]);

        // array of object references
        Date[] dates = new Date[20];
        // adding
        dates[10] = new Date();
        // retrieval
        System.out.println(dates[10]);



//        ArrayList
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            names.add("name " + i);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }









    }
}
