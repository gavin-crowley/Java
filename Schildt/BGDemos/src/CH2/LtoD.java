package CH2;

//listing 15
// Demonstate automatic conversion from long to double.
class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = (double) L;

        System.out.println("L and D: " + L + " " + D);

    }
}