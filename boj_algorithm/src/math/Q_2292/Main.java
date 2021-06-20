package math.Q_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(N);
        } else {
            int range = 2;
            int count = 1;

            while (range <= N) {
                range += 6 * count;
                count++;
            }

            System.out.println(count);
        }
    }
}
