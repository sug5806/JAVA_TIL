package math2.Q_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            return;
        }

        int A = 2;

        while (true) {
            if (N % A == 0) {
                System.out.println(A);
                N = N / A;
                A = 2;
            } else {
                A++;
            }

            if (N == 1) {
                break;
            }
        }
    }
}
