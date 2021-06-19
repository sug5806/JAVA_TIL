package function.Q_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(func(Integer.parseInt(br.readLine())));

    }

    public static int func(int N) {
        int count = 0;

        if (N < 100) {
            return N;
        } else {
            count = 99;

            if (N == 1000) {
                N = 999;
            }

            for (int i = 100; i <= N; i++) {
                int hund = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((ten - hund) == (one - ten)) {
                    count++;
                }
            }
        }

        return count;
    }
}
