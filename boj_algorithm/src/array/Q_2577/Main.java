package array.Q_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());

        int result = A * B * C;

        String str = String.valueOf(result);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i)) - '0']++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
