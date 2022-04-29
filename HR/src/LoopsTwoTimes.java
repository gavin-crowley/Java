import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsTwoTimes {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", N, i, N*i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
