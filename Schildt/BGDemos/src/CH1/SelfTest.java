package CH1;

public class SelfTest {
//    comment
  /*  multi
    line
        comment */
//
//    if (true) {
//        doThis();
//    } else {
//        nowThis();
//    }
//
//    for (int i = 0; i < 10; i++)
//        nowDoThis();

//    public static void main(String[] args) {
//        double earthWeight;
//        double moonWeight;
//
//        earthWeight = 90;
//        moonWeight = 90 * 0.17;
//        System.out.println("A person who weighs " + earthWeight + "Kg on earth," +
//        " will weigh " + moonWeight + "Kg on the moon."
//        );
//    }



        public static void main(String[] args) {
            double meters, inches;
            int counter;

            counter = 0;
            for(meters = 1; meters <= 144; meters++) {
                inches = meters * 39.37; // convert to inches
                System.out.println(meters + " meters is " +
                        inches + " inches.");

                counter++;
                // every 10th line, print a blank line
                if(counter == 12) {
                    System.out.println();
                    counter = 0; // reset the line counter
                }
            }
        }
    }


