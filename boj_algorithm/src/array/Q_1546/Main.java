package array.Q_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        int N = Integer.parseInt(str);


        String[] values = bufferedReader.readLine().split(" ");
        int max = -1;
        double sum = 0.0;

        for (String s : values) {
            int value = Integer.parseInt(s);
            if (max < value) {
                max = value;
            }

            sum += value;
        }

        System.out.println(((sum / max) * 100.0) / N);

    }
}
