public class QuarterOf {
    public static void main(String[] args) {
        int month = 7;
        String quarter;
        switch (month) {
            case 1: quarter = "First";
            case 2: quarter = "First";
            case 3: quarter = "First";
                break;
            case 4: quarter = "Second";
            case 5: quarter = "Second";
            case 6: quarter = "Second";
                break;
            case 7: quarter = "Third";
            case 8: quarter = "Third";
            case 9: quarter = "Third";
                break;
            case 10: quarter = "Fourth";
            case 11: quarter = "Fourth";
            case 12: quarter = "Fourth";
                break;
            default: quarter = "Invalid month";
                break;
        }
        System.out.println(quarter);
    }
}
