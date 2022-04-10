public class ControlFlow {
    public static void main(String[] args) {

        // basic if statements

        int a = 1;
        int b = 0;

        if (a > b) b = 0;

        if (a > b) {
        System.out.println("Hey");
        }


        // if-else statement

        if (a > b) {
            System.out.println("a");
        } else if (a < b) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }


        // switch statement

        switch (a) {
            case 0:
                System.out.println("a is 0");
                break;
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            default:
                System.out.println("a is >= 3");
        }

        // also see switch fall-through

        // switch value can be a variable or statement of types
        // byte, short, char, int, String, Enum

        // new switch (java 14)



        // classic for loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // commas in for loop

        for (int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println(i + j);
        }


        // for each loop

        int someNumbers[] = {25, 42, 36, 75, 91};
        int total = 0;
        for (int element : someNumbers) {
            total += element;
        }


        // nested for each loop

        int matrix[][] = new int[10][20];

        for (int[] subArray: matrix) {
            for (int element : subArray) {
                System.out.println("Element is: " + element);
            }
        }

        // classic for: when index is needed
        // for each: when you just want the element, handy with collections


        // while loop

        while (a > 0) {

        }


        // do while

        do {

        } while (a > 0);



        // break & continue
        // break: ends the loop
        // continue: exits loop for that iteration











































































    }
}
