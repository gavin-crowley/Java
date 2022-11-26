
public class Statistics {

//    private int number;
    private int count;
    private int sum;

    public Statistics() {
//        this.number = number;
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double result = 0;

        if (this.sum != 0 && this.count != 0) {
            result = 1.0 * this.sum / this.count;
        }
        return result;
    }

}
