package while_.Q_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int originNumber = Integer.parseInt(s);

        int N = originNumber;
        int count = 0;

        do {
            N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
            count++;
        } while (originNumber != N);

        bufferedReader.close();

        System.out.println(count);
    }
}
